package hu.ak_akademia.webshop;

import java.util.Date;
import java.util.List;

import hu.ak_akademia.webshop.dao.Dao;
import hu.ak_akademia.webshop.dao.ProductDao;
import hu.ak_akademia.webshop.dto.Product;
import hu.ak_akademia.webshop.dto.Status;

public class JDBCQueryExample3 {

    public static void main(String[] args) {
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

}