package com.itheima.ui;

import com.itheima.service.AccountService;

public class AccountUI {

	public static void main(String[] args) {
		String outer = "liuyan";
		String inner = "tangyan";
		double money = 5000;
		
		//����Service�����
		AccountService service = new AccountService();
		
		service.transfer(outer, inner, money);
	}
}
