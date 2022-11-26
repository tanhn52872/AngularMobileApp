package com.example.demo.model;


public class Product {
	private String id;
	private String name;
	private String description;
	private String thumbnail;
	private double price;
	private int quantity;
	public Product() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", thumbnail=" + thumbnail
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
