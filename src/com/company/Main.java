package com.company;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    //First, I need to define the parameters for the driver name and URL; the H2 Driver
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/test";

    public static void main(String[] args) {

    }
}
