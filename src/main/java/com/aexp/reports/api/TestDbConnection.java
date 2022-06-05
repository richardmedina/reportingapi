package com.aexp.reports.api;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDbConnection {

    private static void testMySqlConnection(){
        String jdbcUrl = "jdbc:mysql://ubuntusql:3306/reportsdb?useSSL=false";
        String user = "richard";
        String password = "medina";

        try {
            Connection myConn = DriverManager.getConnection(jdbcUrl, user, password);
            System.out.println("Connection successful!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
