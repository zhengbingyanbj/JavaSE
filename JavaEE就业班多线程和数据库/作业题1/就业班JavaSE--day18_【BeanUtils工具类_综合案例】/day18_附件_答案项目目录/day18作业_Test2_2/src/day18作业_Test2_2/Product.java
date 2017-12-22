package day18ื๗าต_Test2_2;

public class Product {
	private String id;
	private String brand;
	private String type;
	private double price;
	private String size;
	private String category;
	public Product(String id, String brand, String type, double price, String size, String category) {
		super();
		this.id = id;
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.size = size;
		this.category = category;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", brand=" + brand + ", type=" + type + ", price=" + price + ", size=" + size
				+ ", category=" + category + "]";
	}
	
	
	
	
}	
