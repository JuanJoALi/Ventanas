package com.proyecto.models;

import java.sql.Timestamp;

public class Transaccion {
	private int transactionId;
    private int productId; // Puedes cambiar a un objeto Producto si lo deseas
    private String type;
    private int quantity;
    private Timestamp transactionDate;
    
    public int getProductId() {
		return productId;
	}
    public void setProductId(int productId) {
		this.productId = productId;
	}
    
    public int getTransactionId() {
		return transactionId;
	}
    public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
    
    public String getType() {
		return type;
	}
    public void setType(String type) {
		this.type = type;
	}
    
    public int getQuantity() {
		return quantity;
	}
    public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    
    public Timestamp getTransactionDate() {
		return transactionDate;
	}
    public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}
    
    
}
