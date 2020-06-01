package Person;

public class Person {
	private String name;
	Animal pet;
	
	public Person() {}
	public Person(String Personname, Animal pet) {
		this.name = Personname;
		this.pet = pet;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.printf(getName()+"的宠物是"+pet.getName()+",他喜欢"+pet.enjoy());
	}
	
}
