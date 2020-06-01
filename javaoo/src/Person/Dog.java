package Person;

public class Dog extends Animal{
	private String furcolor;

	public String getFurcolor() {
		return furcolor;
	}
	public void setFurcolor(String furcolor) {
		this.furcolor = furcolor;
	}
	public Dog(String name,String furcolor) {
		super(name);
		this.furcolor= furcolor;
	}
	@Override
	String enjoy() {
		// TODO Auto-generated method stub
		return "啃骨头";
	}
	public String tosString() {
		return "毛色为"+furcolor+"的"+getName();
	}
}
