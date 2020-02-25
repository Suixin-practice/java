package javaoo;

import java.util.Scanner;

public class Circle {
	/**
	 * 定义圆的属性
	 * 半径
	 * 周长
	 * 面积
	 * */
	public double radius;
	public double perimeter;
	public double area;
	public void inputRadius() {
		Scanner inputScanner  = new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		radius = inputScanner.nextDouble();
	}
	public void showPerimter() {
		if(radius <= 0) {
			inputRadius();//判断是否输入
		}
		perimeter = 2*Math.PI*radius;
		System.out.println("周长为："+ perimeter);
		
	}
	public void showArea() {
		area = Math.PI*Math.pow(radius, 2);
		System.out.println("面积为"+area);
	}
}
