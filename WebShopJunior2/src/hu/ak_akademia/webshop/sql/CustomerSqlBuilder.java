package hu.ak_akademia.webshop.sql;

import hu.ak_akademia.webshop.dto.Status;

public class CustomerSqlBuilder {

    private CustomerSqlBuilder() {
    }

    public static String buildSelectAllFromCustomer() {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ");
        sql.append("    customer_id, ");
        sql.append("    first_name, ");
        sql.append("    last_name, ");
        sql.append("    email, ");
        sql.append("    phone_number, ");
        sql.append("    date_of_birth, ");
        sql.append("    creation_date, ");
        sql.append("    modification_date, ");
        sql.append("    status ");
        sql.append("FROM ");
        sql.append("    customer ");
        return sql.toString();
    }

    public static String buildSelectByIdFromCustomer() {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ");
        sql.append("    customer_id, ");
        sql.append("    first_name, ");
        sql.append("    last_name, ");
        sql.append("    email, ");
        sql.append("    phone_number, ");
        sql.append("    date_of_birth, ");
        sql.append("    creation_date, ");
        sql.append("    modification_date, ");
        sql.append("    status ");
        sql.append("FROM ");
        sql.append("    customer ");
        sql.append("WHERE ");
        sql.append("    customer_id = ? ");
        return sql.toString();
    }

    public static String buildInsertCustomer() {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO customer (");
        sql.append("    customer_id, ");
        sql.append("    first_name, ");
        sql.append("    last_name, ");
        sql.append("    email, ");
        sql.append("    phone_number, ");
        sql.append("    date_of_birth ");
        sql.append(") VALUES ( ");
        sql.append("    customer_seq.nextval, ");
        sql.append("    ?, ");
        sql.append("    ?, ");
        sql.append("    ?, ");
        sql.append("    ?, ");
        sql.append("    ? ");
        sql.append(")");
        return sql.toString();
    }

    public static String buildUpdateCustomer() {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE customer SET ");
        sql.append("    first_name = ?, ");
        sql.append("    last_name = ?, ");
        sql.append("    email = ?, ");
        sql.append("    phone_number = ?, ");
        sql.append("    date_of_birth = ?, ");
        sql.append("    modification_date = sysdate, ");
        sql.append("    status = ? ");
        sql.append("WHERE ");
        sql.append("    customer_id = ? ");
        return sql.toString();
    }

    public static String buildDeleteCustomer() {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE customer SET ");
        sql.append("    status = '")
                .append(Status.DELETED.getCode())
                .append("' ");
        sql.append("WHERE ");
        sql.append("    customer_id = ? ");
        return sql.toString();
    }

}