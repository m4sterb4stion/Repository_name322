package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static org.example.Main.stmt;

public class Phonebook {
    protected static void addAbonent() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = sc.nextLine();
        System.out.print("Введите фамилию: ");
        String lastName = sc.nextLine();
        System.out.print("Введите номер телефона: ");
        String phoneNumber = sc.nextLine();
        String sql = "INSERT INTO abonents (name, last_name, phone_number) VALUES ('" + name + "', '" + lastName + "', '" + phoneNumber + "')";
        stmt.executeUpdate(sql);
        System.out.println("Абонент успешно добавлен!");
    }

    protected static void deleteAbonent() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите id абонента для удаления: ");
        int id = sc.nextInt();
        String sql = "DELETE FROM abonents WHERE id=" + id;
        int rowsDeleted = stmt.executeUpdate(sql);
        if (rowsDeleted > 0) {
            System.out.println("Абонент успешно удален!");
        } else {
            System.out.println("Абонент с указанным id не найден!");
        }
    }
    protected static void updateAbonent() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите id абонента для редактирования: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Введите новое имя: ");
        String name = sc.nextLine();
        System.out.print("Введите новую фамилию: ");
        String lastName = sc.nextLine();
        System.out.print("Введите новый номер телефона: ");
        String phoneNumber = sc.nextLine();
        String sql = "UPDATE abonents SET name='" + name + "', last_name='" + lastName + "', phone_number='" + phoneNumber + "' WHERE id=" + id;
        int rowsUpdated = stmt.executeUpdate(sql);
        if (rowsUpdated == 1) {
            System.out.println("Абонент успешно обновлен!");
        } else {
            System.out.println("Абонент не найден!");
        }
    }

    protected static void searchByLastName() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите фамилию для поиска: ");
        String lastName = sc.nextLine();
        String sql = "SELECT * FROM abonents WHERE last_name='" + lastName + "' ORDER BY last_name ASC";
        ResultSet rs = stmt.executeQuery(sql);
        if (!rs.isBeforeFirst()) {
            System.out.println("Абонентов с такой фамилией не найдено!");
        } else {
            System.out.println("\nРезультаты поиска:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Имя: " + rs.getString("name") + ", Фамилия: " + rs.getString("last_name") + ", Телефон: " + rs.getString("phone_number"));
            }
        }
    }

    protected static void searchByPhoneNumber() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер телефона для поиска: ");
        String phoneNumber = sc.nextLine();
        String sql = "SELECT * FROM abonents WHERE phone_number='" + phoneNumber + "' ORDER BY last_name ASC";
        ResultSet rs = stmt.executeQuery(sql);
        if (!rs.isBeforeFirst()) {
            System.out.println("Абонентов с таким номером телефона не найдено!");
        } else {
            System.out.println("\nРезультаты поиска:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Имя: " + rs.getString("name") + ", Фамилия: " + rs.getString("last_name") + ", Телефон: " + rs.getString("phone_number"));
            }
        }
    }
    protected static void printAllAbonents() throws SQLException {
        String sql = "SELECT * FROM abonents ORDER BY last_name ASC";
        ResultSet rs = stmt.executeQuery(sql);
        if (!rs.isBeforeFirst()) {
            System.out.println("В телефонной книге нет абонентов!");
        } else {
            System.out.println("\nТелефонная книга:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Имя: " + rs.getString("name") + ", Фамилия: " + rs.getString("last_name") + ", Телефон: " + rs.getString("phone_number"));
            }
        }
    }
}
