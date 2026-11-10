
package murach.email;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import murach.business.User;
import murach.business.Survey;
import murach.data.UserDB;

public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String action = request.getParameter("action");

        if (action == null) {
            action = "join";
        }

        String url = "/index.html";

        if (action.equals("add")) {

            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dateOfBirth = request.getParameter("dateOfBirth");

            String source = request.getParameter("source");

            String announcements =
                    request.getParameter("announcements") != null
                            ? "Yes" : "No";

            String offers =
                    request.getParameter("offers") != null
                            ? "Yes" : "No";

            String contactMethod = request.getParameter("contactMethod");

            User user = new User(
                    firstName,
                    lastName,
                    email,
                    dateOfBirth
            );

            Survey survey = new Survey(
                    source,
                    announcements,
                    offers,
                    contactMethod
            );

            UserDB.insert(user);

            request.setAttribute("user", user);
            request.setAttribute("survey", survey);

            url = "/thanks.jsp";
        }

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action == null || action.equals("join")) {
            request.getRequestDispatcher("/index.html")
                    .forward(request, response);
        } else {
            doPost(request, response);
        }
    }
}
