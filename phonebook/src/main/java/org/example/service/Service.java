package org.example.service;

import java.sql.SQLException;
import java.util.List;

public interface Service<T> {

    T find(Long id) throws SQLException;
    List<T> getAll() throws SQLException;
    void save(T obj) throws SQLException;
    void update(T obj) throws SQLException;
    void delete(T obj) throws SQLException;

}
