package javaTask28_1;


public class Example4_28 {
	public static void main(String[] args) {
		int[] arr = {11,22,33};
		try {
			for (int i = 0; i <=3; i++) {
			System.out.println(arr[i]);
		}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组下标越界");
		}
	}
}
