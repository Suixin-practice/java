package ExceptionDemo;


public class Exceptions {
	public static int division(int num1,int num2) {
		System.out.println("计算前");
		int result = Integer.MAX_VALUE;
		try {
			result = num1/num2;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//日志记录
			System.out.println("计算后");
		}
		return result;
	}
	public static void main(String[] args) {
		int result = division(5, 0);
		System.out.println("result="+result);}
}
