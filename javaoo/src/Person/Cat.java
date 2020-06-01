package Person;

public class Cat extends Animal{
	private String eyescolor;
	public Cat() {}
	public Cat(String name,String eyescolor) {
		super(name);
		this.eyescolor = eyescolor;
	}
	public String getEyescolor() {
		return eyescolor;
	}
	public void setEyescolor(String eyescolor) {
		this.eyescolor = eyescolor;
	}
	
	public String toString() {
		return "ÑÛ¾¦ÑÕÉ«Îª"+eyescolor+"µÄ"+getName();
	}
	@Override
	String enjoy() {
		return "³ÔÓã";
	}
}
