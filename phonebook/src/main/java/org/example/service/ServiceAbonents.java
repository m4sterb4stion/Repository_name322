package org.example.service;

import org.example.domain.Abonents;
import org.example.repository.Repository;

import java.sql.SQLException;
import java.util.List;

public class ServiceAbonents implements Service<Abonents>{
    private final Repository<Abonents> repository;

    public ServiceAbonents(Repository<Abonents> repository) {
        this.repository = repository;
    }

    @Override
    public Abonents find(Long id) throws SQLException {
        return repository.find(id);
    }

    @Override
    public List<Abonents> getAll() throws SQLException {
        return repository.list();
    }

    @Override
    public void save(Abonents obj) throws SQLException {
        repository.save(obj);
    }

    @Override
    public void update(Abonents obj) throws SQLException {
        repository.update(obj);
    }

    @Override
    public void delete(Abonents obj) throws SQLException {
        repository.delete(obj);
    }




}

