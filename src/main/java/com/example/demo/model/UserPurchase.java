package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class UserPurchase {

	
	@Column(name="purchaseID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int purchaseID;
	@Column(name="purchaseDate")
    private Date purchaseDate;
	@ManyToOne
	@JoinColumn(name = "ProductId") 
	private Product product;
	@Column(name="totalUnit")
    private int totalUnit;
	@Column(name="purchaseByUser")
    private User purchaseByUser;
	@Column(name="purchaseFromUser")
    private User purchaseFromUser;
	public int getPurchaseID() {
		return purchaseID;
	}
	public void setPurchaseID(int purchaseID) {
		this.purchaseID = purchaseID;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getTotalUnit() {
		return totalUnit;
	}
	public void setTotalUnit(int totalUnit) {
		this.totalUnit = totalUnit;
	}
	public User getPurchaseByUser() {
		return purchaseByUser;
	}
	public void setPurchaseByUser(User purchaseByUser) {
		this.purchaseByUser = purchaseByUser;
	}
	public User getPurchaseFromUser() {
		return purchaseFromUser;
	}
	public void setPurchaseFromUser(User purchaseFromUser) {
		this.purchaseFromUser = purchaseFromUser;
	}
}
