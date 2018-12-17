package hu.ak_akademia.webshop.sql;

public class ProductSqlBuilder {

	public ProductSqlBuilder() {

	}

	String buildInsertProduct() {
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT PRODUCT_ID,");
		sql.append("   PRODUCT_NAME,");
		sql.append("   price,");
		sql.append("   X__INSDATE,");
		sql.append("   X__MODDATE,");
		sql.append("   STATUS");
		sql.append(" FROM product");
		return sql.toString();
	}
	
}
