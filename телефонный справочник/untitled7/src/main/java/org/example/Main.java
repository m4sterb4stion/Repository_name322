package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;

import static org.example.Phonebook.*;

public class Main {
    static final String DB_URL = "jdbc:mysql://localhost:3306/phonebook";
    static final String USER = "root";
    static final String PASS = "root";

    static Connection conn = null;
    static Statement stmt = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            while (true) {
                System.out.println("\n1. Добавить абонента");
                System.out.println("2. Удалить абонента");
                System.out.println("3. Редактировать абонента");
                System.out.println("4. Поиск абонента по фамилии");
                System.out.println("5. Поиск абонента по телефонному номеру");
                System.out.println("6. Вывод всех абонентов в алфавитном порядке");
                System.out.println("7. Выход");
                System.out.print("Введите номер команды: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        addAbonent();
                        break;
                    case 2:
                        deleteAbonent();
                        break;
                    case 3:
                        updateAbonent();
                        break;
                    case 4:
                        searchByLastName();
                        break;
                    case 5:
                        searchByPhoneNumber();
                        break;
                    case 6:
                        printAllAbonents();
                        break;
                    case 7:
                        stmt.close();
                        conn.close();
                        System.exit(0);
                    default:
                        System.out.println("Неверная команда!");
                }
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }



}