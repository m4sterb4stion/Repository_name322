package org.example.repository;

import org.example.DBWorker;
import org.example.domain.Abonents;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AbonentsRepository implements Repository<Abonents> {
    private final DBWorker connector;


    public AbonentsRepository() {
        this.connector = new DBWorker();
    }


    @Override
    public Abonents find(Long id) throws SQLException {
        String show = "select * from abonents where id = " + id;
        Statement statement = connector.getConnect().createStatement();
        ResultSet resultSet = statement.executeQuery(show);
        resultSet.next();

        String name = resultSet.getString("name");
        String last_name = resultSet.getString("last_name");
        String phone_number = resultSet.getString("phone_number");

        return new Abonents(id, name, last_name, phone_number);
    }

    @Override
    public void save(Abonents obj) throws SQLException {
        String save = "insert into abonents (name, last_name, phone_number) values (?, ?, ?)";

        PreparedStatement preparedStatement = connector.getConnect().prepareStatement(save);

        preparedStatement.setString(1, obj.getName());
        preparedStatement.setString(2, obj.getLast_name());
        preparedStatement.setString(3, obj.getPhone_number());

        preparedStatement.execute();

    }

    @Override
    public void delete(Abonents obj) throws SQLException {
        String delete = "delete from abonents where id= " + obj.getId();

        Statement statement = connector.getConnect().createStatement();
        statement.execute(delete);

    }

    @Override
    public List<Abonents> list() throws SQLException {
        List<Abonents> list = new ArrayList<>();

        String show = "select * from abonents order by last_name";
        Statement statement = connector.getConnect().createStatement();
        ResultSet resultSet = statement.executeQuery(show);

        while (resultSet.next()) {
            long id = resultSet.getLong("id");
            String name = resultSet.getString("name");
            String last_name = resultSet.getString("last_name");
            String phone_number = resultSet.getString("phone_number");

            list.add(new Abonents(id, name, last_name, phone_number));
        }
        return list;
    }

    @Override
    public void update(Abonents obj) throws SQLException {
        String show = "update abonents set name=?, last_name=?, phone_number =? where id =" + obj.getId();
        PreparedStatement preparedStatement = connector.getConnect().prepareStatement(show);

        preparedStatement.setString(1, obj.getName());
        preparedStatement.setString(2, obj.getLast_name());
        preparedStatement.setString(3, obj.getPhone_number());

        preparedStatement.execute();

    }



}