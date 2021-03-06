package Person;

abstract class Animal {
	private String name;

	public Animal() {};
	
	public Animal(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	abstract String enjoy();
}
