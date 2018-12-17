package hu.ak_akademia.webshop;

import java.util.Date;
import java.util.List;

import hu.ak_akademia.webshop.dao.CustomerDao;
import hu.ak_akademia.webshop.dao.Dao;
import hu.ak_akademia.webshop.dao.OrderDao;
import hu.ak_akademia.webshop.dao.ProductDao;
import hu.ak_akademia.webshop.dto.Customer;
import hu.ak_akademia.webshop.dto.Order;
import hu.ak_akademia.webshop.dto.Product;
import hu.ak_akademia.webshop.dto.Status;

public class Main {

    public static void main(String[] args) {
        testProduct();
        testCustomer();
        testOrder();
    }

    private static void testProduct() {
        Dao<Product> dao = new ProductDao();

        System.out.println("Termékek lekérdezése...");
        List<Product> products = dao.getAll(50);
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("...kész.");

        System.out.print("Termék létrehozása...");
        Product product = new Product();
        product.setName("Teszt2");
        product.setPrice(10000);
        product.setCreated(new Date());
        product.setModified(new Date());
        product.setStatus(Status.ACTIVE);
        dao.create(product);
        System.out.println("...kész.");

        System.out.print("Termék törlése...");
        Product productToDelete = new Product(1);
        dao.delete(productToDelete);
        System.out.println("...kész.");

        System.out.println("Termék lekérdezése annak azonosítója alapján...");
        Product productToGet = new Product(7);
        Product productQueriedById = dao.getById(productToGet);
        System.out.println(productQueriedById);
        System.out.println("...kész.");

        System.out.print("Termék frissítése...");
        Product updateFromThis = new Product(7);

        Product updateToThis = productQueriedById;
        updateToThis.setName("Teszt4");

        dao.update(updateFromThis, updateToThis);
        System.out.println("...kész.");
    }

    private static void testCustomer() {
        Dao<Customer> dao = new CustomerDao();

        System.out.println("Vásárlók lekérdezése...");
        List<Customer> customers = dao.getAll(50);
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        System.out.println("...kész");

        System.out.println("Vásárló létrehozása...");
        Customer customerToCreate = new Customer();
        customerToCreate.setFirstName("Még1");
        customerToCreate.setLastName("Teszt");
        customerToCreate.seteMail("mt@fakemail.com");
        customerToCreate.setPhoneNumber("00368468934");
        customerToCreate.setDateOfBirth(new Date(983457843346L));
        dao.create(customerToCreate);
        System.out.println("...kész");
        System.out.println("...kész");

        System.out.println("Vásárló logikai törlése...");
        Customer customerToDelete = new Customer(4);
        dao.delete(customerToDelete);
        System.out.println("...kész");

        System.out.println("Vásárló frissítése...");
        Customer from = new Customer(5);
        Customer to = dao.getById(from);
        to.setFirstName("ÚjabbTeszt");
        dao.update(from, to);
        System.out.println("...kész");
    }

    private static void testOrder() {
        Dao<Order> dao = new OrderDao();

        System.out.print("Megrendelés létrehozása...");
        Order orderToCreate = new Order();
        orderToCreate.setCustomerId(7);
        orderToCreate.setProductId(7);
        orderToCreate.setQuantity(7);
        dao.create(orderToCreate);
        System.out.println("...kész");

        System.out.print("Megrendelés frissítése...");
        Order from = new Order(7);
        Order to = dao.getById(from);
        to.setQuantity(77);
        to.setProductId(7);
        dao.update(from, to);
        System.out.println("...kész");
    }

}