package javaooOne;

public class Demo {
	public static void main(String[] args) {
		Demos demos = new Demos();
		Swap(demos);
		System.out.println(demos.attr1+"\t"+demos.attr2);
	}
	static class Demos{
		int attr1=10;
		int attr2 = 50;
	}
	public static void Swap(Demos demos) {
		demos = new Demos();
		int temp = demos.attr1;
		demos.attr1 = demos.attr2;
		demos.attr2 = temp;
	}
}
