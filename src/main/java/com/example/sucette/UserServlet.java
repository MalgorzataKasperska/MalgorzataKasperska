package com.example.sucette;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @email Ramesh Fadatare
 */

@WebServlet("/userregister")
public class UserServlet extends HttpServlet {

    private UserDB userDB;

    public void init() {
        userDB = new UserDB();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");

        User user = new User();
        user.setName(firstName);
        user.setSurname(lastName);
        user.setLogin(username);
        user.setPassword(password);
        user.setEmail(contact);
        user.setSubscription(address);

        try {
            userDB.registerUser(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}