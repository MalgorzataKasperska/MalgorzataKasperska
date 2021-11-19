package com.example.sucette;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UserDB {

    public int registerUser(User user) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO users" +
                "(user_id, user_name, user_surname, user_login, user_passwd, user_email, user_subscription) VALUES " +
                " (?, ?, ?, ?, ?,?,?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");
        String jdbcURL = "jdbc:mysql://localhost:3306/SucetteDB";
        String username = "root";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password);


        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getSurname());
            preparedStatement.setString(4, user.getLogin());
            preparedStatement.setString(5, user.getPassword());
            preparedStatement.setString(6, user.getEmail());
            preparedStatement.setString(7, user.getSubscription());

            System.out.println(preparedStatement);

            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return result;
    }
}