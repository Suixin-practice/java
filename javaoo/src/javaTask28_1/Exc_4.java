package javaTask28_1;

import java.nio.channels.Pipe;

public class Exc_4 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		try {
			p1 = null;
			p1.say();
		} catch (Exception e) {
			System.out.println("ø’÷∏’Î“Ï≥£");
		}
		
		p2.say();
	}
}

class Person{
	void  say() {
		System.out.println("hello");
	}
}
