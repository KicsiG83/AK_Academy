package hu.ak_akademia.webshop.dto;

import java.util.Date;

public class Product {

	int id;
	String product_name;
	int price;
	Date x__insdate;
	Date x__moddate;
	Status status;

	public Product() {
		
	}
	
	public Product(int id, String product_name, int price, Date x__insdate, Date x__moddate, Status status) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.price = price;
		this.x__insdate = x__insdate;
		this.x__moddate = x__moddate;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getX__insdate() {
		return x__insdate;
	}

	public void setX__insdate(Date x__insdate) {
		this.x__insdate = x__insdate;
	}

	public Date getX__moddate() {
		return x__moddate;
	}

	public void setX__moddate(Date x__moddate) {
		this.x__moddate = x__moddate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=");
		builder.append(id);
		builder.append(", product_name=");
		builder.append(product_name);
		builder.append(", price=");
		builder.append(price);
		builder.append(", x__insdate=");
		builder.append(x__insdate);
		builder.append(", x__moddate=");
		builder.append(x__moddate);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
}
