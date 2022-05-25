package com.cg.eauction.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="product")
public class Product {
	@Id
	@SequenceGenerator(name = "product_id",allocationSize = 5)
	private int productId;
	@Column(name="product_name", length = 25)
	private String productName;
	@Column(name="product_name", length = 25)
	private int minPrice;
	@Column(name="description", length = 150)
	private String description;
	@Column(name="vendor_id", length = 25)
	private int vendorId;
	@Column(name="highest_bid", length = 25)
	private int highestBid;
	@Column(name="product_type", length = 30)
	private String productType;
	@Column(name="status", length = 15)
	private String status;
	@Column(name="start_date", columnDefinition = "date")
	private Date startDate ;
	@Column(name="start_date", columnDefinition = "date")
	private Date endDate;
	
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
	public int getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public int getHighestBid() {
		return highestBid;
	}
	public void setHighestBid(int highestBid) {
		this.highestBid = highestBid;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	


}
