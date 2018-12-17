package hu.ak_akademia.webshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import hu.ak_akademia.webshop.dto.Customer;
import hu.ak_akademia.webshop.dto.Order;
import hu.ak_akademia.webshop.dto.Product;
import hu.ak_akademia.webshop.dto.Status;
import hu.ak_akademia.webshop.exception.WebShopRuntimeException;
import hu.ak_akademia.webshop.sql.OrderSqlBuilder;

public class OrderDao extends AbstractDao<Order> {

    @Override
    public void create(Order entity) {
        validate(entity);
        String sql = OrderSqlBuilder.buildInsertOrder();
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            int index = 1;
            statement.setInt(index++, entity.getCustomerId());
            statement.setInt(index++, entity.getProductId());
            statement.setInt(index++, entity.getQuantity());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Az orders táblába az új rekord beszúrása sikertelen.");
            e.printStackTrace();
        }
    }

    private void validate(Order entity) {
        validateCustomer(entity);
        validateProduct(entity);
    }

    private void validateCustomer(Order entity) {
        try {
            int customerId = entity.getCustomerId();
            Dao<Customer> customerDao = new CustomerDao();
            Customer customer = customerDao.getById(new Customer(customerId));
            if (!Status.ACTIVE.equals(customer.getStatus())) {
                throw new WebShopRuntimeException("Érvénytelen vásárló azonosító, a megadott vásárló logikailag törölt.");
            }
        } catch (NoSuchElementException e) {
            throw new WebShopRuntimeException("Érvénytelen vásárló azonosító.", e);
        }
    }

    private void validateProduct(Order entity) {
        try {
            int productId = entity.getProductId();
            Dao<Product> productDao = new ProductDao();
            Product product = productDao.getById(new Product(productId));
            if (!Status.ACTIVE.equals(product.getStatus())) {
                throw new WebShopRuntimeException("Érvénytelen termék azonosító, a megadott termék logikailag törölt.");
            }
        } catch (NoSuchElementException e) {
            throw new WebShopRuntimeException("Érvénytelen termék azonosító.", e);
        }
    }

    @Override
    public void delete(Order entity) {
        String sql = OrderSqlBuilder.buildDeleteOrder();
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, entity.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Az orders tábla rekordjának logikai törlése sikertelen.");
            e.printStackTrace();
        }
    }

    @Override
    public void update(Order from, Order to) {
        validateProduct(to);
        String sql = OrderSqlBuilder.buildUpdateOrder();
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            int index = 1;
            statement.setInt(index++, to.getProductId());
            statement.setInt(index++, to.getQuantity());
            statement.setString(index++, to.getStatus()
                    .getCode());
            statement.setInt(index++, from.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Az orders táblán végrehajtott frissítés sikertelen.");
            e.printStackTrace();
        }
    }

    @Override
    public List<Order> getAll(int limit) {
        String sql = OrderSqlBuilder.buildSelectAllFromOrder();
        List<Order> orders = new ArrayList<>();
        int counter = 0;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            try (ResultSet resultSet = statement.executeQuery(sql)) {
                while (resultSet.next()) {
                    Order order = new Order();
                    order.setId(resultSet.getInt("orders_id"));
                    order.setCustomerId(resultSet.getInt("customer_id"));
                    order.setProductId(resultSet.getInt("product_id"));
                    order.setQuantity(resultSet.getInt("quantity"));
                    order.setCreated(new java.util.Date(resultSet.getDate("creation_date")
                            .getTime()));
                    order.setModified(new java.util.Date(resultSet.getDate("modification_date")
                            .getTime()));
                    order.setStatus(Status.getFromCode(resultSet.getString("status")));

                    orders.add(order);

                    if (++counter >= limit) {
                        break;
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Az orders táblán végrehajtott lekérdezés sikertelen.");
            e.printStackTrace();
        }
        return orders;
    }

    @Override
    public Order getById(Order entity) {
        String sql = OrderSqlBuilder.buildSelectByIdFromOrder();
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, entity.getId());
            try (ResultSet resultSet = statement.executeQuery()) {
                boolean hasNext = resultSet.next();
                if (!hasNext) {
                    throw new NoSuchElementException("Ilyen azonosítóval nem létezik megrendelés.");
                }

                Order order = new Order();
                order.setId(resultSet.getInt("orders_id"));
                order.setCustomerId(resultSet.getInt("customer_id"));
                order.setProductId(resultSet.getInt("product_id"));
                order.setQuantity(resultSet.getInt("quantity"));
                order.setCreated(new java.util.Date(resultSet.getDate("creation_date")
                        .getTime()));
                order.setModified(new java.util.Date(resultSet.getDate("modification_date")
                        .getTime()));
                order.setStatus(Status.getFromCode(resultSet.getString("status")));
                return order;
            }
        } catch (SQLException e) {
            throw new WebShopRuntimeException("Az orders táblából az azonosító alapján történő lekérdezés sikertelen.", e);
        }
    }

}