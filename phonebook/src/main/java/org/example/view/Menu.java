package org.example.view;

import org.example.domain.*;
import org.example.service.Service;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private final Service<Abonents> abonentsService;
    private AbonentsMenu abonentsMenu;
    public Menu(Service<Abonents> abonentsService){
        this.abonentsService = abonentsService;
        this.abonentsMenu= new AbonentsMenu(this);
    }
    public void draw() throws SQLException {
        System.out.println("--- МЕНЮ ---");
        System.out.println("1. Абоненты");



        execute();
    }
    private void execute() throws SQLException {
        int command = scanner.nextInt();

        switch (command){
            case 1-> {
                abonentsMenu.drawAbonents();
            }

            }
        }
    }

