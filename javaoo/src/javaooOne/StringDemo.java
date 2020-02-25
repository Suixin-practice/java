package javaooOne;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class StringDemo {
	public static void main(String[] args) {
		//indexOf从头开始判断字符串中是否包含某个字符，并返回相对应的索引
		String password = "123456abc";
		System.out.println(password.indexOf("2", 0));
		//字符串截取，[1,3)左闭右开的规则
		System.out.println(password.substring(1, 3));
		
		
		
		
		
		
		
		
	}
		//lastIndexOf从末尾开始判断字符串中是否包含某个字符，并返回相对应的索引
		//判断字符串中只能有一个小数点，不能再第一位和最后一位
//	 public static boolean isDecimal(String str){
//		 boolean isDecimal = true;
//		 for (int i = 0; i < str.length(); i++) {
//			 //charater类方法判断字符串中是否为数字，字母，大小写，字符的大小写格式
//			if(!Character.isDigit(str.charAt(i))) {
//				if(str.charAt(i)=='.') {
//					if(isDecimal==0 || i==str.length()-1) {//如果小数点在第一位和最后一位
//						isDecimal= false;
//						break;
//					}
//				}else {
//					isDecimal= false;
//					break;
//				}
//			}
//		}
//		 //判断小数点数量
//		 if(!(str.contains(".")&&str.indexOf('.')==str.lastIndexOf('.'))) {
//			 return false;
//		 }
//		 if(str.indexOf('.')==0 || str.indexOf(".")==str.length()-1) {
//			 
//		 }
//	 }
//		
		
		
		
		
		
		
		
		
//		String value = "1111";
////		value += "222";
//		value = value.concat("3333");//连接字符串
//		System.out.println(value);
//		String value1 = "Hello world";
//		value1.concat("good");
//		System.out.println(value1);
		
		//trim去掉字符串左右两侧的空格
//		Scanner input = new Scanner(System.in);
//		System.out.println("请输入用户名：");
//		String uNmae = input.nextLine().trim();
//		System.out.println(uNmae);
//		String name = "abcdef";
//		name.toCharArray();
//		System.out.println(name);
//		String a = "abc";
//		String b = "def";
//		String c = a+b;
//		System.out.println(c);
//		//字符串比较方法，equals
//		System.out.println("abc".equals(a));
//		//检测是否以某个字符开头startsWith，检测是否以某个字符结尾endsWith
//		System.out.println("abc".startsWith("ab"));
//		System.out.println("abc".endsWith("d"));
//		//判断一个字符串是否包含另一个字符串
//		System.out.println("abcdef".contains("a"));
		
}
