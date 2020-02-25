package javaooOne;

public class BoxingDemo {
	public static void main(String[] args) {
		Integer num1 =100;
		Integer num2 =100;
		System.out.println(num1==num2);
		String song= "Yesterday Once More";
		song = "Batter Man";
		System.out.println(song);
		
		String name1 = "xuetang";
		String name2 = "xuetang";
		System.out.println(name1==name2);//如果字符串相等，那么只会保存一个，且字符串不可更改
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		double num1 =3.14;//自动装箱
//		Double numDouble = new Double("3.14");
//		Double num1Double = Double.valueOf(num1);//两种装箱方式
//		Double num2Double = 3.14;//自动装箱
//		num1 = num1Double;//自动拆箱
//		num1 =num2Double.doubleValue(); //拆箱
//		System.out.println(num1 + "\t" +numDouble);
	}
}
