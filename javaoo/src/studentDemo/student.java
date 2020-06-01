package studentDemo;
/**
 * ËåĞÄ
 * 1811610014
 */
public class student{
	private String name;
	private int age;
	public student(String name,int age) {
		this.age=age;
		this.name=name;
	}
	public void show() {
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