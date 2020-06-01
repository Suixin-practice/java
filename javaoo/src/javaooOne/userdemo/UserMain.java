package javaooOne.userdemo;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		System.out.println("请输入用户名：");
//		String userNameString = input.next();
		System.out.println("请输入密码：");
		String passwordString = input.next();
		System.out.println(StringUtil.validatePasswordString(passwordString));
//		System.out.println("请输入邮箱：");
//		String emailString = input.next();
	}
}
