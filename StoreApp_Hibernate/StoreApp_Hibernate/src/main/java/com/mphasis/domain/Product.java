package com.mphasis.domain;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_details")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //mysql
	private int id;
	@Column(name="name" , nullable = false)
	private String name;
	@Column(name="price" , nullable = false)
	private double price;
	@Column(name="manufacturing_date" , nullable = false)
	private LocalDate manufacturingDate;
	public Product(String name, double price, LocalDate manufacturingDate) {
		super();
		this.name = name;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
	}
	public Product() {
		
	}
	public Product(int id, String name, double price, LocalDate manufacturingDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	@Override
	public String toString() {
		return "\nProduct [id=" + id + ", name=" + name + ", price=" + price + ", manufacturingDate=" + manufacturingDate
				+ "]";
	}
}
