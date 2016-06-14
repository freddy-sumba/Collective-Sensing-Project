package com.ucuenca.edu.ec.backaplication.repositories.impl.mock;

import com.ucuenca.edu.ec.backaplication.contract.Repository;

import java.util.List;

public abstract class GenericMockRepository<T> implements Repository<T> {

    @Override
    public List<T> getAll() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T getById(int id) {
        return (T) null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
