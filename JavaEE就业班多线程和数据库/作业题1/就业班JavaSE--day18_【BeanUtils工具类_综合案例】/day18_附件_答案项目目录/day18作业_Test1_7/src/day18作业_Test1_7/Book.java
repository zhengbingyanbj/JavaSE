package day18ื๗าต_Test1_7;

public class Book {
	private String title;
	private String author;
	private double price;
	private String publishDate;
	public Book(String title, String author, double price, String publishDate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publishDate = publishDate;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", publishDate=" + publishDate
				+ "]";
	}
	
	
}
