package hu.ak_akademia.webshop.sql;

import hu.ak_akademia.webshop.dto.Status;

public class ProductSqlBuilder {

    private ProductSqlBuilder() {
        // példányosítás megakadályozása végett
    }

    public static String buildInsertProduct() {
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
        sql.append("?, ");
        sql.append("?, ");
        sql.append("?, ");
        sql.append("?, ");
        sql.append("? ");
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

    public static String buildDeleteProduct() {
        return "UPDATE product SET status = '" + Status.DELETED.getCode() + "', modification_date = sysdate WHERE product_id = ?";
    }

    public static String buildUpdateProduct() {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE product SET ");
        sql.append("    product_name = ?, ");
        sql.append("    price = ?, ");
        sql.append("    status = ?, ");
        sql.append("    modification_date = sysdate ");
        sql.append("WHERE ");
        sql.append("    product_id = ? ");
        return sql.toString();
    }

    public static String buildGetByIdSelect() {
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
        sql.append("WHERE ");
        sql.append("    product_id = ? ");
        return sql.toString();
    }

}