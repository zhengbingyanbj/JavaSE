package com.itheima.ui;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.itheima.domain.Product;
import com.itheima.service.ProductService;

/*
 * 用户界面
 */
public class ProductUI {

	public static void main(String[] args) {
		System.out.println("欢迎欢迎！热烈欢迎！");
		
		while(true){
			
			System.out.println("请输入以下操作:");
			System.out.println("C:创建、U:修改、D:删除、DA:删除所有、I:通过ID查询、FA:查询所有、Q:退出");
			String choose = enterString();
			switch (choose.toUpperCase()) {
			case "C":
				addProduct();
				break;
			case "U":
				updateProduct();
				
				break;
			case "D":
				deleteById();
				
				break;
			case "DA":
				deleteAll();
				
				break;
			case "I":
				findById();
				break;
			case "FA":
				findAll();
				break;
			case "Q":
				System.out.println("您确定要退出吗？Y/N");
				String exit = enterString();
				if("y".equalsIgnoreCase(exit)){
					System.out.println("再见来不及握手！");
					System.exit(0);
				}
				break;
				
			default:
				System.out.println("你瞎啊？看不懂吗？");
				break;
			}
		}
		
	}
	/*
	 * 批量删除
	 * 定义一个set集合用来存储所有用户输入的id
	 * 循环  
	 * 	  提示用户输入要删除的商品id
	 * 	  判断id是否为-1
	 * 		如果是-1跳出循环
	 *   使用用户输入的id 查询数据库 得到商品对象
	 *   判断商品对象是否存在
	 *   	如果不存在 
	 *   		continue;
	 *   如果存在 提示用户标记的是哪个商品
	 *   并将商品的id存入到集合中
	 * 调用service层deleteAll方法
	 */
	private static void deleteAll() {
		
		findAll();
		
		
		//定义一个set集合用来存储所有用户输入的id
		Set<Integer> ids = new HashSet<Integer>();
		
		ProductService service = new ProductService();
		while(true){
			System.out.println("请输入要删除商品的id:");
			int pid = enterInt();
			//  判断id是否为-1
			if(pid==-1){
				//如果是-1跳出循环
				break;
			}
			//调用service层的findById方法查询出用户要删除的商品
			Product findById = service.findById(pid);
			if(findById==null){
				System.out.println("要删除的商品不存在！");
				continue;
			}
			System.out.println("您已标记了商品"+findById);
			//将id放入到集合中
			ids.add(pid);
		}
		//如果用户没有删除 直接方法结束
		if(ids.size()==0){
			return;
		}
		
		System.out.println("您确定要删除"+ids.size()+"条记录吗?Y/N");
		String isDeleteAll = enterString();
		if("y".equalsIgnoreCase(isDeleteAll)){
			//调用service层的deleteAll方法
			service.deleteAll2(ids);
			System.out.println("删除成功");
		}
		
		
		
		
		
	}
	/*
	 * 提示用户输入要删除商品的id
	 * 调用service层findById的方法
	 * 返回商品对象
	 * 判断商品对象是否为null 
	 * 		如果为null id不存在
	 * 		return
	 * 如果不为null 告知用户删除的是哪个商品
	 * 提示用户是否要删除
	 * 
	 */
	private static void deleteById() {
		findAll();
		
		
		System.out.println("请输入要删除的商品的id:");
		int pid = enterInt();
		//调用service层findById的方法
		ProductService service = new ProductService();
		Product findById = service.findById(pid);
		if(findById==null){
			System.out.println("你输入的id不存在！");
			return ;
		}
		
		System.out.println("您要删除的对象为："+findById);
		System.out.println("您确定要删除吗？Y/N");
		String isDelete = enterString();
		if("y".equalsIgnoreCase(isDelete)){
			//调用service层 根据id删除的方法
			service.deleteById(pid);
			System.out.println("删除成功");
		}
		
	}
	/*
	 * 提示用户输入用修改商品的id
	 * 调用service的findById方法查询对应的商品
	 * 判断商品是否存在
	 * 		如果商品为null说明商品不存在
	 * 		return
	 * 如果商品不为Null 说明商品存在
	 * 提示用户输入商品名称
	 * 调用service层findByName方法查询对应的商品
	 * 判断商品 
	 * 		如果商品不为null说明商品名已经存在
	 * 		return;
	 * 如果商品为null 说明商品名称可以使用继续修改
	 * 提示用户输入商品价格
	 * 提示用户输入新商品的分类
	 * 将数据封装到一个Product对象中
	 * 调用service的updateProduct方法
	 * 
	 * 
	 */
	private static void updateProduct() {
		findAll();
		
		
		System.out.println("请输入要修改商品的id:");
		int pid = enterInt();
		//使用pid查询数据库 判断是否有这个商品
		ProductService service = new ProductService();
		Product findById = service.findById(pid);   
		
		//如果商品不存在说明id没有
		if(findById==null){
			System.out.println("商品不存在！");
			return;
		}
		System.out.println("您要修改的商品为："+findById);
		//如果商品存在提示继续修改
		System.out.println("请输入新商品名称:"); 
		String pname = enterString();
		
		//判断商品名称是否已存在
		Product findByName = service.findByName(pname);
		//如果商品存在 并且商品名称不和已经常出来的商品名称相同 那么就是已存在
		if(findByName!=null && !(pname.equals(findById.getPname()))){
			System.out.println("商品已存在！");
			return;
		}
		//如果商品名可用 提示用户继续修改
		System.out.println("请输入新商品的价格:");
		double price = enterDouble();
		System.out.println("请输入新商品的分类(1.家电   2.服饰   3.化妆品):");
		int category_id = enterInt();
		
		//将数据封装到Product对象中
		
		Product p = new Product(pid, pname, price, "1", category_id);
		
		//调用service层方法修改商品
		service.updateProduct(p);
		System.out.println("修改商品成功");
		
	}
	/*
	 * 添加商品
	 * 
	 * 提示用户输入新商品名称
	 * 调用service层findByName方法查询数据库
	 * 返回一个Product对象
	 * 判断Product对象是否存在 
	 * 		如果不为null说明商品已经存在
	 * 		return
	 * 如果product对象为null商品不存在可以添加
	 * 继续提示用户 输入价格  分类
	 * 将用户输入的数据封装到一个Product对象中
	 * 调用service层addProduct方法将对象添加
	 * 
	 */
	private static void addProduct() {
		System.out.println("请输入新商品名称:");
		String pname = enterString();
		//创建Service对象
		ProductService service = new ProductService();
		Product findByName = service.findByName(pname);
		//判断对象
		if(findByName!=null){
			System.out.println("该商品已存在！");
			return ;
		}
		
		//如果product对象为null商品不存在可以添加
		System.out.println("请输入新商品的价格:");
		double price = enterDouble();
		System.out.println("请输入新商品的分类(1.家电   2.服饰  3.化妆品):");
		int category_id = enterInt();
		//将数据封装到一个Product对象中
		Product p = new Product(0, pname, price, "1", category_id);
		//调用Service层的addProduct()
		service.addProduct(p);
		System.out.println("添加成功！");
	}
	/*
	 * 提示用户输入要查询的id
	 * 调用service层的findById方法
	 * 返回一个Product对象
	 */
	private static void findById() {
		System.out.println("请输入您要查询商品的id:");
		int pid = enterInt();
		//调用service层的findById方法
		ProductService service = new ProductService();
		Product p = service.findById(pid);
		
		if(p==null){
			System.out.println("您输入的id不存在！");
			return;
		}
		System.out.println("您查询的记录为:"+p);
		
		
	}

	/*
	 * 查询所有
	 * 创建Service层对象 调用findAll方法
	 * 得到所有product对象的集合
	 * 遍历集合 依次获取每个对象
	 * 打印即可
	 * 
	 */
	private static void findAll() {
		ProductService service = new ProductService();
		
		List<Product> list = service.findAll();
		//如果集合为空 告诉用户没有数据 
		if(list==null || list.size()==0){
			System.out.println("没有查询到数据！");
			return;
		}
		
		System.out.println("您查询的结果为:");
		for(Product p : list){
			System.out.println(p);
		}
	}


	public static String enterString(){
		return new Scanner(System.in).nextLine();
	}
	public static double enterDouble(){
		return new Scanner(System.in).nextDouble();
	}
	public static int enterInt(){
		return new Scanner(System.in).nextInt();
	}
}
