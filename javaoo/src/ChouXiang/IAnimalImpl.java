package ChouXiang;

class Dog implements IAnimal{
	public void shout() {
		System.out.println("ÍôÍô");
	}
	public void breathe() {
		System.out.println("xixixix");
	}
}//1811610014 ËåĞÄ

public class IAnimalImpl{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.shout();
		d.breathe();
	}
}