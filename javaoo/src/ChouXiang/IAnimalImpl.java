package ChouXiang;

class Dog implements IAnimal{
	public void shout() {
		System.out.println("����");
	}
	public void breathe() {
		System.out.println("xixixix");
	}
}//1811610014 ����

public class IAnimalImpl{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.shout();
		d.breathe();
	}
}