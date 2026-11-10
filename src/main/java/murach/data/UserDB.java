
package murach.data;

import murach.business.User;

public class UserDB {

    public static void insert(User user) {
        // Demo: Chưa lưu vào database
        System.out.println("Email: " + user.getEmail());
        System.out.println("First Name: " + user.getFirstName());
        System.out.println("Last Name: " + user.getLastName());
    }
}
