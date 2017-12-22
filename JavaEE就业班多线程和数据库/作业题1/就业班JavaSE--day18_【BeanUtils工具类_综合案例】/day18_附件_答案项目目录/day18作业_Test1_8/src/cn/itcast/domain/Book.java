package cn.itcast.domain;

public class Book {
	private String title;
	private String publishDate;
	private double price;
	private String publishHouse;
	private String author;
	public Book(String title, String publishDate, double price, String publishHouse, String author) {
		super();
		this.title = title;
		this.publishDate = publishDate;
		this.price = price;
		this.publishHouse = publishHouse;
		this.author = author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublishHouse() {
		return publishHouse;
	}
	public void setPublishHouse(String publishHouse) {
		this.publishHouse = publishHouse;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", publishDate=" + publishDate + ", price=" + price + ", publishHouse="
				+ publishHouse + ", author=" + author + "]";
	}
	
	
}
