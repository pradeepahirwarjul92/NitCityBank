package com.heg.model;

public class Order {

	private OrderId id;
	private String product;

	public OrderId getId() {
		return id;
	}

	public void setId(OrderId id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Order(OrderId id, String product) {
		super();
		this.id = id;
		this.product = product;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", product=" + product + "]";
	}

}
