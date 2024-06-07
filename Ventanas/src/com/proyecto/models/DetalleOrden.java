package com.proyecto.models;

public class DetalleOrden {
    private int orderDetailId;
    private int orderId; // Puedes cambiar a un objeto Orden si lo deseas
    private int productId; // Puedes cambiar a un objeto Producto si lo deseas
    private int quantity;
    private double unitPrice;

    
    public int getOrderDetailId() {
		return orderDetailId;
	}
    public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}
    
    public int getOrderId() {
		return orderId;
	}
    public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
    
    public int getProductId() {
		return productId;
	}
    public void setProductId(int productId) {
		this.productId = productId;
	}
    
    public int getQuantity() {
		return quantity;
	}
    public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    
    public double getUnitPrice() {
		return unitPrice;
	}
    public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
