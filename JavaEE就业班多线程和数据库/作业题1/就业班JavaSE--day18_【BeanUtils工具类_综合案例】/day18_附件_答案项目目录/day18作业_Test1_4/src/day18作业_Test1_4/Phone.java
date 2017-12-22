package day18ื๗าต_Test1_4;

public class Phone {
	private String brand;
	private String color;
	private double price;
	private double size;
	public Phone(String brand, String color, double price, double size) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.size = size;
	}
	public Phone() {
		super();
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
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", color=" + color + ", price=" + price + ", size=" + size + "]";
	}
	
	
}
