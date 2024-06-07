package com.proyecto.models;

import java.util.Date;

public class Orden {
    private int orderId;
    private Date orderDate;
    private int customerId; // Puedes cambiar a un objeto Cliente si lo deseas

    public int getOrderId() {
		return orderId;
	}
    public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
    
    public Date getOrderDate() {
		return orderDate;
	}
    public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
    
    public int getCustomerId() {
		return customerId;
	}
    public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}
