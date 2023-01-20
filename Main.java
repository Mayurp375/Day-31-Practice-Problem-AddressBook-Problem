package org.example.Day31.adressbook;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        //connection
        int ch;
        MyConnection.connection();
        while (true) {
            System.out.println("enter 0 - exit , 1 - show database," +
                    "2- add now contact");
            ch = sc.nextInt();
            if (ch == 0) {
                break;
            }
            if (ch == 1) {
                ComandLine.createDataBase();
            }
            if (ch == 2) {
                ComandLine.insertData();
            }
        }
    }
}
