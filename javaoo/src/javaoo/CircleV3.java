package javaoo;

public class CircleV3 {
	/**
	 * 定义圆的属性
	 * 半径
	 * 周长
	 * 面积
	 * */
	private double radius;
	private double perimeter;
	private double area;
	
	public CircleV3() {}
	public CircleV3(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void show() {
		System.out.println("面积"+ this.getArea());
		System.out.println("周长"+this.getPerimeter());
	}
	public void setRadius(double radius) {
		if(radius >= 0) {
			radius =1;
		}else {
			this.radius = radius;
		}
	}
	public double getPerimeter() {
		perimeter = 2*Math.PI*radius;
		return perimeter;
	}
	public double getArea() {
		area = Math.PI*Math.pow(radius, 2);
		return area;
	}
}
