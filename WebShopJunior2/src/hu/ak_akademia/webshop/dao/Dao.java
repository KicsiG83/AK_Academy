package hu.ak_akademia.webshop.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface Dao<E> { // Data Access Object

    Connection getConnection() throws SQLException;

    void create(E entity);

    void delete(E entity);

    void update(E from, E to);

    List<E> getAll(int limit);
    
    E getById(E entity);

}