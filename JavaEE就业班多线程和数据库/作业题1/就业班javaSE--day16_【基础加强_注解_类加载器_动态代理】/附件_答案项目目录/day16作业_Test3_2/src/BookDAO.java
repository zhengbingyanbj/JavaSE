

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BookDAO implements IBookDAO{
	//���ͼ�飺
	public void add() throws Exception{
		Scanner sc = new Scanner(System.in);
		//1.��ȡ����ͼ����Ϣ��������֤ͼ����
		List<Book> bookList = this.readAll();
		//2.��������
		System.out.println("����������ͼ����Ϣ��");
		System.out.println("ͼ���ţ�");
		String bookNo = sc.next();
		for(Book b : bookList){
			if(bookNo.equals(b.getBookNo())){
				System.out.println("ͼ���ţ�" + bookNo + " �Ѿ����ڣ����ʧ�ܣ���");
				return;
			}
		}
		System.out.println("���ߣ�");
		String author = sc.next();
		System.out.println("�����磺");
		String publishing = sc.next();
		System.out.println("�������ڣ�");
		String publishDate = sc.next();
		System.out.println("���ۣ�");
		Double price = sc.nextDouble();
		System.out.println("������");
		Integer count = sc.nextInt();
		
		Book book = new Book(bookNo,author,publishing,publishDate,price,count);
		bookList.add(book);
		
		//3.����д��
		writeAll(bookList);
		//4.��ʾ
		System.out.println("��ӳɹ���");
	}
	//�޸�ͼ��
	public void update() throws Exception{
		Scanner sc = new Scanner(System.in);
		//1.��ȡ����ͼ����Ϣ��������֤ͼ����
		List<Book> bookList = this.readAll();
		//2.��������
		System.out.println("������Ҫ�޸ĵ�ͼ���ţ�");
		String bookNo = sc.next();
		for(int i = 0;i < bookList.size() ; i++){
			if(bookNo.equals(bookList.get(i).getBookNo())){
				System.out.println("�����������ߣ�");
				String author = sc.next();
				System.out.println("�������³����磺");
				String publishing = sc.next();
				System.out.println("�������³������ڣ�");
				String publishDate = sc.next();
				System.out.println("�������µ��ۣ�");
				Double price = sc.nextDouble();
				System.out.println("��������������");
				Integer count = sc.nextInt();
				
				Book b = bookList.get(i);
				b.setAuthor(author);
				b.setPublishing(publishing);
				b.setPublishDate(publishDate);
				b.setPrice(price);
				b.setCount(count);
				
				//����д���ļ�
				this.writeAll(bookList);
				
				System.out.println("�����ѱ��޸ģ�");
				return;
			}
		}
		System.out.println("��ţ�" + bookNo + " ͼ��û�ҵ���");
	}
	//ɾ��ͼ��
	public void delete() throws Exception{
		Scanner sc = new Scanner(System.in);
		//1.��ȡ����ͼ����Ϣ��������֤ͼ����
		List<Book> bookList = this.readAll();
		//2.��������
		System.out.println("������Ҫɾ����ͼ���ţ�");
		String bookNo = sc.next();
		for(int i = 0;i < bookList.size() ; i++){
			if(bookNo.equals(bookList.get(i).getBookNo())){
				System.out.println("ȷ��Ҫɾ����(y/n) :");
				String op = sc.next();
				if("y".equals(op)){
					bookList.remove(i);
					//����д���ļ�
					this.writeAll(bookList);
					System.out.println("ɾ���ɹ���");
					return;
				}
			}
		}
		System.out.println("ͼ���ţ�" + bookNo + " û�ҵ���");
	}
	//��ѯ����ͼ��
	@MyTest
	public void findBook() throws Exception{
		List<Book> bookList = this.readAll();
		System.out.println("ͼ����\t����\t������\t��������\t\t����\t����");
		System.out.println("========================================================================================");
		if(bookList.size() == 0){
			System.out.println("�������ݡ�");
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
	
	//���ļ���ȡ����ͼ����Ϣ
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
	//��һ�����ϵ�����Book����д�뵽�ļ�
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
