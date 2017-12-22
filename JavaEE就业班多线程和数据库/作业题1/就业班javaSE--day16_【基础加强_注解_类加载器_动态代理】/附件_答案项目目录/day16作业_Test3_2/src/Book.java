

public class Book {
	private String bookNo;
	private String author;
	private String publishing;
	private String publishDate;
	private Double price;
	private Integer count;
	public Book(String bookNo, String author, String publishing, String publishDate, Double price, Integer count) {
		super();
		this.bookNo = bookNo;
		this.author = author;
		this.publishing = publishing;
		this.publishDate = publishDate;
		this.price = price;
		this.count = count;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBookNo() {
		return bookNo;
	}
	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishing() {
		return publishing;
	}
	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", author=" + author + ", publishing=" + publishing + ", publishDate="
				+ publishDate + ", price=" + price + ", count=" + count + "]";
	}
	
	
}
