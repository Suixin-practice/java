package javaooOne.userdemo;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		System.out.println("�������û�����");
//		String userNameString = input.next();
		System.out.println("���������룺");
		String passwordString = input.next();
		System.out.println(StringUtil.validatePasswordString(passwordString));
//		System.out.println("���������䣺");
//		String emailString = input.next();
	}
}
