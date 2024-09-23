//package org.example;
//
//import lombok.SneakyThrows;
//
//import java.sql.*;
//
//
//public class JdbcDemo {
//
//    private static String CONNECTION_URL = "jdbc:mysql://localhost:3306/mydb";
//    private static String DB_USERNAME = "root";
//    private static String DB_PASSWORD = "root";
//
//    // JDBC - JAVA DATA BASE CONNECTIVITY
//    @SneakyThrows
//    public static void main(String[] args) {
//
//        Class.forName("org.mysql.Driver");
//
//        executeWithStatement("CREATE DATABASE IF NOT EXISTS (id bigInt, name varchar(255), price numeric)");
//        addPerson(1L, "Gaw", 1232.2);
//        addPerson(2L, "Gaw2", 90.2);
//
//    }
//
//    public static void addPerson(Long id, String name, Double price) {
//        executeWithStatement("INSERT INTO person (id, name, price) VALUES (?, ?, ?)".formatted(id, name, price));
//
//    }
//
//    @SneakyThrows
//
//    public static void executeWithStatement(String query) {
//
//        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, DB_USERNAME, DB_PASSWORD)) {
//            Statement statement = connection.createStatement();
//            System.out.println("Executing: " + query);
//            statement.executeUpdate(query);
//        }
//    }
//}
