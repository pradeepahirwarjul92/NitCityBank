package com.heg.model;

import java.io.Serializable;

public class OrderId implements Serializable {

	private Long orderId;
	private Long customerId;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "OrderId [orderId=" + orderId + ", customerId=" + customerId + "]";
	}

	public OrderId(Long orderId, Long customerId) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
	}

	public OrderId() {
		super();
		// TODO Auto-generated constructor stub
	}

}
