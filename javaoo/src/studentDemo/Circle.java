package studentDemo;

public class Circle implements Shape{

	@Override
	public double area(double num) {
		
		return Math.PI*(Math.pow(num, 2));
	}
	
}
