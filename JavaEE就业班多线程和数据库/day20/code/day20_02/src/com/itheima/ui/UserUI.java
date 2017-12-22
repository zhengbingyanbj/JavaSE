package com.itheima.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.itheima.service.UserService;

public class UserUI {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		String username = sc.nextLine();
		String password = sc.nextLine();
		
		UserService service = new UserService();
		boolean b = service.register(username, password);
		if(b){
			System.out.println("注册成功");
		}else{
			System.out.println("用户已存在，注册失败");
		}
	}
}
