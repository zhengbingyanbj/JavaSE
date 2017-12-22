package day18ื๗าต_Test3_1;

public class Phone {
	private String name;
	private String brand;
	private double size;
	private double price;
	private String color;
	public Phone(String name, String brand, double size, double price, String color) {
		super();
		this.name = name;
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.color = color;
	}
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", brand=" + brand + ", size=" + size + ", price=" + price + ", color=" + color
				+ "]";
	}
	
	
}	
