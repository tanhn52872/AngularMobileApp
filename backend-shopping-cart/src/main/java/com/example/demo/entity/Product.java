package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product implements Serializable {
	private static final long serialVersionUID = -297553281792804396L;
	@Id
	private String id;
	@Column(name = "product_name", length = 30)
	private String name;
	@Column(name = "product_description", length = 30)
	private String description;
	@Column(name = "thumbnail", length = 30)
	private String thumbnail;
	@Column(name = "price")
	private double price;
	@Column(name = "quantity")
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