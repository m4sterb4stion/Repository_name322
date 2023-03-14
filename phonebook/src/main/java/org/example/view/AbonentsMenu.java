package org.example.view;

import org.example.domain.Abonents;
import org.example.service.Service;
import org.example.service.ServiceAbonents;
import org.example.repository.AbonentsRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class AbonentsMenu {
    Scanner scanner = new Scanner(System.in);

    private final Service<Abonents> abonentsService = new ServiceAbonents(new AbonentsRepository());


    private Menu menu;

    public AbonentsMenu(Menu menu) {
        this.menu=menu;
    }


    public void drawAbonents() throws SQLException {
        System.out.println("---Абоненты---");
        System.out.println("1.Добавить");
        System.out.println("2.Удалить");
        System.out.println("3.Редактировать");
        System.out.println("4.Список всех абонентов");
        System.out.println("0. Назад");

        switch (scanner.nextInt()) {
            case 1 -> newAbonents();
            case 2 -> deleteAbonents();
            case 3 -> changeAbonents();
            case 4 -> drawListAbonents();
            case 0 -> menu.draw();
        }
    }
    private void  newAbonents() throws SQLException {
        System.out.println("Введите данные абонента");
        scanner.nextLine();
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите фамилию: ");
        String lastName = scanner.nextLine();
        System.out.print("Введите номер телефона: ");
        String phoneNumber = scanner.nextLine();
        Abonents abonents= new Abonents(null, name, lastName, phoneNumber);
        abonentsService.save(abonents);
    }
    void drawListAbonents() throws SQLException {
        System.out.println();
        System.out.println("---Список абонентов---");
        abonentsService.getAll().forEach(System.out::println);

    }
    private  void deleteAbonents() throws SQLException {
        drawListAbonents();
        System.out.println("Выберите абонента, которого надо удалить");
        Long id= scanner.nextLong();
        Abonents abonents= abonentsService.find(id);
        abonentsService.delete(abonents);
    }


    private  void  changeAbonents() throws SQLException {
        drawListAbonents();
        System.out.println("Выберите абонента для изменения");
        Long id = scanner.nextLong();

        Abonents abonents= abonentsService.find(id);

        System.out.println("Что изменить?");
        System.out.println("1. Имя");
        System.out.println("2. Фаимлию");
        System.out.println("3. Телефон");
        System.out.println("9. Сохранить и выйти");
        System.out.println("0. Назад");


        switch (scanner.nextInt()){
            case 1->{
                System.out.println("Введите новое имя ");
                scanner.nextLine();
                abonents.setName(scanner.nextLine());
                abonentsService.update(abonents);
            }
            case 2->{
                System.out.println("Введите новую фамилию ");
                scanner.nextLine();
                abonents.setLast_name(scanner.nextLine());
                abonentsService.update(abonents);
            }
            case 3->{
                System.out.println("Введите новый номер ");
                scanner.nextLine();
                abonents.setPhone_number(scanner.nextLine());
                abonentsService.update(abonents);
            }
            case 9->{
                abonentsService.update(abonents);
                scanner.nextLine();
                drawAbonents();
            }
            case  0 ->{
                drawAbonents();
            }

        }

    }
}
