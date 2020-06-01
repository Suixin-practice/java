package studentDemo;

public class Undergraduate extends student{
	private String degree;

	
	public Undergraduate(String name,int age,String degree) {
		super(name, age);
		this.degree=degree;
	}
	
	@Override
	public void show() {
		System.out.println(getName()+getAge()+getDegree());
	}
	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	
	
}
