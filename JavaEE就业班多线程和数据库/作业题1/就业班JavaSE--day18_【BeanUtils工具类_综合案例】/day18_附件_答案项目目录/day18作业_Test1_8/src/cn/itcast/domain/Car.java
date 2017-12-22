package cn.itcast.domain;

public class Car {
	private String brand;
	private String color;
	private double price;
	private String type;
	private String productDate;
	public Car(String brand, String color, double price, String type, String productDate) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.type = type;
		this.productDate = productDate;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProductDate() {
		return productDate;
	}
	public void setProductDate(String productDate) {
		this.productDate = productDate;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", price=" + price + ", type=" + type + ", productDate="
				+ productDate + "]";
	}
	
	
}
