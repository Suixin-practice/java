package javatask2605;

public class Human {
	private String name;
	private int age;
	
	public Human(String name,int age) {
		
	}
	public void speak() {
		System.out.println("我是人类");
	}
	
	public void getInfo(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println(name+age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
