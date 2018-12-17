package hu.ak_akademia.webshop.sql;

import java.text.SimpleDateFormat;

import hu.ak_akademia.webshop.dto.Product;

public class ProductSqlBuilderOpenForSqlInjectionAttack {

    private ProductSqlBuilderOpenForSqlInjectionAttack() {
        // példányosítás megakadályozása végett
    }

    public static String buildInsertProduct(Product product) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO product ( ");
        sql.append("    product_id, ");
        sql.append("    product_name, ");
        sql.append("    price, ");
        sql.append("    creation_date, ");
        sql.append("    modification_date, ");
        sql.append("    status )");
        sql.append("VALUES ( ");
        sql.append("product_seq.nextval, ");
        sql.append("'").append(product.getName()).append("', ");
        sql.append(product.getPrice()).append(", ");
        sql.append("to_date('").append(dateFormat.format(product.getCreated())).append("', 'YYYY.MM.DD'), ");
        sql.append("to_date('").append(dateFormat.format(product.getModified())).append("', 'YYYY.MM.DD'), ");
        sql.append("'").append(product.getStatus().getCode()).append("' ");
        sql.append(") ");
        return sql.toString();
    }

    public static String buildSelectProduct() {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ");
        sql.append("    product_id, ");
        sql.append("    product_name, ");
        sql.append("    price, ");
        sql.append("    creation_date, ");
        sql.append("    modification_date, ");
        sql.append("    status ");
        sql.append("FROM ");
        sql.append("    product ");
        return sql.toString();
    }

}