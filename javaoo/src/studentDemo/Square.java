package studentDemo;

public class Square implements Shape{

	@Override
	public double area(double num) {
		return Math.pow(num, 2);
	}
	
}
