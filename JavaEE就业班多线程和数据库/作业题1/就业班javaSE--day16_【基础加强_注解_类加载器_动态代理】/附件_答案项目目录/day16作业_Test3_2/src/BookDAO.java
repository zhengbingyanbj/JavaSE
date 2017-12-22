

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BookDAO implements IBookDAO{
	//添加图书：
	public void add() throws Exception{
		Scanner sc = new Scanner(System.in);
		//1.获取所有图书信息，用于验证图书编号
		List<Book> bookList = this.readAll();
		//2.接收数据
		System.out.println("请输入以下图书信息：");
		System.out.println("图书编号：");
		String bookNo = sc.next();
		for(Book b : bookList){
			if(bookNo.equals(b.getBookNo())){
				System.out.println("图书编号：" + bookNo + " 已经存在！添加失败！！");
				return;
			}
		}
		System.out.println("作者：");
		String author = sc.next();
		System.out.println("出版社：");
		String publishing = sc.next();
		System.out.println("出版日期：");
		String publishDate = sc.next();
		System.out.println("单价：");
		Double price = sc.nextDouble();
		System.out.println("数量：");
		Integer count = sc.nextInt();
		
		Book book = new Book(bookNo,author,publishing,publishDate,price,count);
		bookList.add(book);
		
		//3.重新写入
		writeAll(bookList);
		//4.提示
		System.out.println("添加成功！");
	}
	//修改图书
	public void update() throws Exception{
		Scanner sc = new Scanner(System.in);
		//1.获取所有图书信息，用于验证图书编号
		List<Book> bookList = this.readAll();
		//2.接收数据
		System.out.println("请输入要修改的图书编号：");
		String bookNo = sc.next();
		for(int i = 0;i < bookList.size() ; i++){
			if(bookNo.equals(bookList.get(i).getBookNo())){
				System.out.println("请输入新作者：");
				String author = sc.next();
				System.out.println("请输入新出版社：");
				String publishing = sc.next();
				System.out.println("请输入新出版日期：");
				String publishDate = sc.next();
				System.out.println("请输入新单价：");
				Double price = sc.nextDouble();
				System.out.println("请输入新数量：");
				Integer count = sc.nextInt();
				
				Book b = bookList.get(i);
				b.setAuthor(author);
				b.setPublishing(publishing);
				b.setPublishDate(publishDate);
				b.setPrice(price);
				b.setCount(count);
				
				//重新写入文件
				this.writeAll(bookList);
				
				System.out.println("数据已被修改！");
				return;
			}
		}
		System.out.println("编号：" + bookNo + " 图书没找到！");
	}
	//删除图书
	public void delete() throws Exception{
		Scanner sc = new Scanner(System.in);
		//1.获取所有图书信息，用于验证图书编号
		List<Book> bookList = this.readAll();
		//2.接收数据
		System.out.println("请输入要删除的图书编号：");
		String bookNo = sc.next();
		for(int i = 0;i < bookList.size() ; i++){
			if(bookNo.equals(bookList.get(i).getBookNo())){
				System.out.println("确定要删除吗？(y/n) :");
				String op = sc.next();
				if("y".equals(op)){
					bookList.remove(i);
					//重新写入文件
					this.writeAll(bookList);
					System.out.println("删除成功！");
					return;
				}
			}
		}
		System.out.println("图书编号：" + bookNo + " 没找到！");
	}
	//查询所有图书
	@MyTest
	public void findBook() throws Exception{
		List<Book> bookList = this.readAll();
		System.out.println("图书编号\t作者\t出版社\t出版日期\t\t单价\t数量");
		System.out.println("========================================================================================");
		if(bookList.size() == 0){
			System.out.println("【无数据】");
		}else{
			for(Book b : bookList){
				System.out.println(b.getBookNo() + "\t"
									+ b.getAuthor() + "\t"
									+ b.getPublishing() + "\t"
									+ b.getPublishDate() + "\t"
									+ b.getPrice() + "\t"
									+ b.getCount());
			}
		}
		System.out.println("========================================================================================");
	}
	
	//从文件读取所有图书信息
	private List<Book> readAll() throws Exception{
		BufferedReader in = new BufferedReader(new FileReader("Test3_1.txt"));
		List<Book> bookList = new ArrayList<>();
		String row = null;
		while((row = in.readLine()) != null){
			String[] arr = row.split(",");
			Book b = new Book();
			b.setBookNo(arr[0]);
			b.setAuthor(arr[1]);
			b.setPublishing(arr[2]);
			b.setPublishDate(arr[3]);
			b.setPrice(Double.valueOf(arr[4]));
			b.setCount(Integer.valueOf(arr[5]));
			
			bookList.add(b);
		}
		in.close();
		return bookList;
	}
	//将一个集合的所有Book对象写入到文件
	private void writeAll(List<Book> bookList) throws IOException{
		BufferedWriter out = new BufferedWriter(new FileWriter("Test3_1.txt"));
		for(Book b : bookList){
			String row = b.getBookNo() + "," + 
							b.getAuthor() + "," + 
							b.getPublishing() + "," + 
							b.getPublishDate() + "," + 
							b.getPrice() + "," + 
							b.getCount();
			out.write(row);
			out.newLine();
		}
		out.close();
		
	}
}
