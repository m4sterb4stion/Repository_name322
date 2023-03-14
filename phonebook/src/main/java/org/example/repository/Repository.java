package org.example.repository;

import java.sql.SQLException;
import java.util.List;

public interface Repository<T> {
    T find(Long id) throws SQLException;
    void save(T obj) throws SQLException;
    void delete(T obj) throws SQLException;
    List<T> list() throws SQLException;
    void update(T obj) throws SQLException;


}

