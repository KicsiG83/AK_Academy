package hu.ak_akademia.webshop.sql;

import hu.ak_akademia.webshop.dto.Status;

public class OrderSqlBuilder {

    private OrderSqlBuilder() {
    }

    public static String buildSelectByIdFromOrder() {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ");
        sql.append("    orders_id, ");
        sql.append("    customer_id, ");
        sql.append("    product_id, ");
        sql.append("    quantity, ");
        sql.append("    creation_date, ");
        sql.append("    modification_date, ");
        sql.append("    status ");
        sql.append("FROM ");
        sql.append("    orders ");
        sql.append("WHERE ");
        sql.append("    orders_id = ? ");
        return sql.toString();
    }

    public static String buildSelectAllFromOrder() {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ");
        sql.append("    orders_id, ");
        sql.append("    customer_id, ");
        sql.append("    product_id, ");
        sql.append("    quantity, ");
        sql.append("    creation_date, ");
        sql.append("    modification_date, ");
        sql.append("    status ");
        sql.append("FROM ");
        sql.append("    orders ");
        return sql.toString();
    }

    public static String buildDeleteOrder() {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE orders SET ");
        sql.append("    status ='")
                .append(Status.DELETED.getCode())
                .append("' ");
        sql.append("WHERE ");
        sql.append("    orders_id = ? ");
        return sql.toString();
    }

    public static String buildInsertOrder() {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO orders ( ");
        sql.append("    orders_id, ");
        sql.append("    customer_id, ");
        sql.append("    product_id, ");
        sql.append("    quantity ");
        sql.append(") VALUES ( ");
        sql.append("    orders_seq.nextval, ");
        sql.append("    ?, ");
        sql.append("    ?, ");
        sql.append("    ? ");
        sql.append(")");
        return sql.toString();
    }

    public static String buildUpdateOrder() {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE orders SET ");
        sql.append("    product_id = ?, ");
        sql.append("    quantity = ?, ");
        sql.append("    modification_date = sysdate, ");
        sql.append("    status = ? ");
        sql.append("WHERE ");
        sql.append("    orders_id = ? ");
        return sql.toString();
    }

}