package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Product 
{
	
	@Column(name="productId")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	@Column(name="productName")
    private String productName;
	@Column(name="productDesc")
    private String productDesc;
	@Column(name="productImg")
    private String productImg;
	@Column(name="productSellPrice")
    private double productSellPrice;
	@Column(name="productCostPrice")
    private double productCostPrice;
	@Column(name="stockUnit")
    private int stockUnit;
	@Column(name="createdByUser")
	@ManyToOne
	@JoinColumn(name = "createdByUser") 
	private User user;
    
	@Column(name="createDate")
    private Date createDate;
	@Column(name="isDeleted")
    private int isDeleted;
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
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getProductImg() {
		return productImg;
	}
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	public double getProductSellPrice() {
		return productSellPrice;
	}
	public void setProductSellPrice(double productSellPrice) {
		this.productSellPrice = productSellPrice;
	}
	public double getProductCostPrice() {
		return productCostPrice;
	}
	public void setProductCostPrice(double productCostPrice) {
		this.productCostPrice = productCostPrice;
	}
	public int getStockUnit() {
		return stockUnit;
	}
	public void setStockUnit(int stockUnit) {
		this.stockUnit = stockUnit;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	

}
