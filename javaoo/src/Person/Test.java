package Person;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog("����", "��ɫ");
		Cat cat = new Cat("����", "��ɫ");
		Person person1 = new Person("����", cat);
		Person person2 = new Person("����", dog);
		person1.speak();
		person2.speak();
	}
}
