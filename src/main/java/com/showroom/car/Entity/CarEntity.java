package com.showroom.car.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CarEntity {
	@Id
	String brand;
	String model;
	int year;
	int price;
	String imgUrl;
	
	public CarEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarEntity(String brand, String model, int year, int price, String imgUrl) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
		this.imgUrl = imgUrl;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return "CarEntity [brand=" + brand + ", model=" + model + ", year=" + year + ", price=" + price + ", imgUrl="
				+ imgUrl + "]";
	}
	
	

}
