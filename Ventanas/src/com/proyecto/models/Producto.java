package com.proyecto.models;

public class Producto {
    private int productId;
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productStock;
    private int categoryId; // Puedes cambiar a un objeto Categoria si lo deseas
    private int supplierId; // Puedes cambiar a un objeto Proveedor si lo deseas
    
    
    public int getProductId() {
		return productId;
	}
    public void setProductId(int productId) {
		this.productId = productId;
	}
    
    public String getProductName() {
		return productName;
	}
    public void setProductName(String productName) {
		this.productName = productName;
	}
    
    public String getProductDescription() {
		return productDescription;
	}
    public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
    
    public double getProductPrice() {
		return productPrice;
	}
    public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
    
    public int getProductStock() {
		return productStock;
	}
    public void setProductStock(int productStock) {
		this.productStock = productStock;
	}
    
    public int getCategoryId() {
		return categoryId;
	}
    public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
    
    public int getSupplierId() {
		return supplierId;
	}
    public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
    
}
