package com.itheima.ui;

import com.itheima.service.AccountService;

public class AccountUI {

	public static void main(String[] args) {
		String outer = "liuyan";
		String inner = "tangyan";
		double money = 5000;
		
		//创建Service层对象
		AccountService service = new AccountService();
		
		service.transfer(outer, inner, money);
	}
}
