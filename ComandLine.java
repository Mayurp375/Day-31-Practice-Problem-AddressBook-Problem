package org.example.Day31.adressbook;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class ComandLine {

    public static void createDataBase() {

        Connection root = MyConnection.connection();
        String query = "";
        try {
            root.createStatement();
        }catch (SQLException e){

        }
    }
}
