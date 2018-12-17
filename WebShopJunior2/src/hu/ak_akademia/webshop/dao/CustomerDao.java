package hu.ak_akademia.webshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import hu.ak_akademia.webshop.dto.Customer;
import hu.ak_akademia.webshop.dto.Status;
import hu.ak_akademia.webshop.exception.WebShopRuntimeException;
import hu.ak_akademia.webshop.sql.CustomerSqlBuilder;

public class CustomerDao extends AbstractDao<Customer> {

    @Override
    public void create(Customer entity) {
        String sql = CustomerSqlBuilder.buildInsertCustomer();
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            int index = 1;
            statement.setString(index++, entity.getFirstName());
            statement.setString(index++, entity.getLastName());
            statement.setString(index++, entity.geteMail());
            statement.setString(index++, entity.getPhoneNumber());
            statement.setDate(index++, new java.sql.Date(entity.getDateOfBirth()
                    .getTime()));
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("A customer táblába történő rekord beszúrás sikertelen.");
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Customer entity) {
        String sql = CustomerSqlBuilder.buildDeleteCustomer();
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, entity.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("A customer tábla rekordjának logikai törlése sikertelen.");
            e.printStackTrace();
        }
    }

    @Override
    public void update(Customer from, Customer to) {
        String sql = CustomerSqlBuilder.buildUpdateCustomer();
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            int index = 1;
            statement.setString(index++, to.getFirstName());
            statement.setString(index++, to.getLastName());
            statement.setString(index++, to.geteMail());
            statement.setString(index++, to.getPhoneNumber());
            statement.setDate(index++, new java.sql.Date(to.getDateOfBirth()
                    .getTime()));
            statement.setString(index++, to.getStatus()
                    .getCode());
            statement.setInt(index++, from.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("A customer tábla rekordjának módosítása sikertelen.");
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> getAll(int limit) {
        String sql = CustomerSqlBuilder.buildSelectAllFromCustomer();
        List<Customer> customers = new ArrayList<>();
        int counter = 0;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            try (ResultSet resultSet = statement.executeQuery(sql)) {
                while (resultSet.next()) {
                    Customer customer = new Customer();
                    customer.setId(resultSet.getInt("customer_id"));
                    customer.setFirstName(resultSet.getString("first_name"));
                    customer.setLastName(resultSet.getString("last_name"));
                    customer.seteMail(resultSet.getString("email"));
                    customer.setPhoneNumber(resultSet.getString("phone_number"));
                    customer.setDateOfBirth(new java.util.Date(resultSet.getDate("date_of_birth")
                            .getTime()));
                    customer.setCreated(new java.util.Date(resultSet.getDate("creation_date")
                            .getTime()));
                    customer.setModified(new java.util.Date(resultSet.getDate("modification_date")
                            .getTime()));
                    customer.setStatus(Status.getFromCode(resultSet.getString("status")));

                    customers.add(customer);

                    if (++counter >= limit) {
                        break;
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("A customer táblán végrehajtott lekérdezés sikertelen.");
            e.printStackTrace();
        }
        return customers;
    }

    @Override
    public Customer getById(Customer entity) {
        String sql = CustomerSqlBuilder.buildSelectByIdFromCustomer();
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, entity.getId());
            try (ResultSet resultSet = statement.executeQuery()) {
                boolean hasNext = resultSet.next();
                if (!hasNext) {
                    throw new NoSuchElementException("Ilyen azonosítóval nem létezik vásárló.");
                }

                Customer customer = new Customer();
                customer.setId(resultSet.getInt("customer_id"));
                customer.setFirstName(resultSet.getString("first_name"));
                customer.setLastName(resultSet.getString("last_name"));
                customer.seteMail(resultSet.getString("email"));
                customer.setPhoneNumber(resultSet.getString("phone_number"));
                customer.setDateOfBirth(new java.util.Date(resultSet.getDate("date_of_birth")
                        .getTime()));
                customer.setCreated(new java.util.Date(resultSet.getDate("creation_date")
                        .getTime()));
                customer.setModified(new java.util.Date(resultSet.getDate("modification_date")
                        .getTime()));
                customer.setStatus(Status.getFromCode(resultSet.getString("status")));
                return customer;
            }
        } catch (SQLException e) {
            throw new WebShopRuntimeException("A customer táblából az azonosító alapján történő lekérdezés sikertelen.", e);
        }
    }

}