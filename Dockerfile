# Stage 1: Build Maven project
FROM maven:3.9-eclipse-temurin-25 AS build

WORKDIR /app

COPY pom.xml .

RUN mvn -B dependency:go-offline

COPY src ./src

RUN mvn -B clean package -DskipTests


# Stage 2: Run WAR on Tomcat
FROM tomcat:10.1.61-jre25-temurin-noble

ENV PORT=10000

RUN rm -rf /usr/local/tomcat/webapps/*

COPY --from=build /app/target/email.war \
    /usr/local/tomcat/webapps/ROOT.war

EXPOSE 10000

CMD ["sh", "-c", "sed -i \"s/port=\\\"8080\\\"/port=\\\"${PORT:-10000}\\\"/\" \"$CATALINA_HOME/conf/server.xml\" && exec catalina.sh run"]
