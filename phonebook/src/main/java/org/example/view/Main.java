package org.example.view;


import org.example.domain.Abonents;
import org.example.repository.AbonentsRepository;
import org.example.repository.Repository;
import org.example.service.Service;
import org.example.service.ServiceAbonents;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Repository<Abonents> abonentsRepository = new AbonentsRepository();
        Service<Abonents> abonentsService = new ServiceAbonents(abonentsRepository);


        Menu menu = new Menu(abonentsService);
        while (true) {
            menu.draw();
        }

    }
}