package com.itheima.test03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test03_01 {
	/*
	 * 模拟用户登录和注册功能实现。
	接收用户输入的用户名和密码，然后和当前项目user.txt文件中存储的用户名、密码匹配。
	如果文件已经存在用户名并且密码也是正确的，提示登录成功，否则提示登录失败。
	如果文件中不存在该用户名，则使用该用户名和密码注册一个新的账号，并提示注册成功。
	 */
	public static void main(String[] args) {
		// 创建键盘流入对象
		Scanner sc = new Scanner(System.in);
		// 请输入用户名和密码
		System.out.println("请输入用户名：");
		String username = sc.nextLine();
		System.out.println("请输入密码：");
		String password = sc.nextLine();
		// 调用登录方法
		login(username,password);
	}
	
	/*
	 *  登录方法：判断用户名和密码是否正确，正确返回true,否则返回false
	 */
	public static boolean login(String username,String password){
		// 声明高效字符输入流
		BufferedReader br = null;
		try {
			// 创建文件对象
			File file = new File("user.txt");
			// 判断文件是否存在
			if(!file.exists()) {
				// 创建文件
				file.createNewFile();
				// 登录失败
				return false;
			}
			// 创建高效字符输入流
			br = new BufferedReader(new FileReader(file));
			// 定义变量接收读取的每一行数据
			String line = null;
			// 定义标记记录用户名是否存在
			boolean exist = false;
			// 循环读取每一行数据
			while((line = br.readLine())!= null) {
				// 使用-分隔
				String[] strs = line.split("=");
				// 判断用户名是否正确
				if(strs[0].equals(username)) {
					exist = true;
					if(strs[1].equals(password)) {
						System.out.println("登录成功");
						return true;
					} else {
						System.out.println("密码错误，登录失败");
						return false;
					}
				}
			}
			if(!exist) { // 用户名不存在
				System.out.println("用户名不存在");
				// 注册账号
				register(username,password);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭流并释放资源
			try {
				if(br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	/*
	 * 注册用户方法
	 */
	public static void register(String username,String password) throws IOException{
		// 创建字符输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt",true));
		// 保存用户名和I密码
		bw.write(username);
		bw.write("=");
		bw.write(password);
		// 写换行符
		bw.newLine();
		// 关闭流
		bw.close();
	}
}
