package Person;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog("旺财", "红色");
		Cat cat = new Cat("花花", "白色");
		Person person1 = new Person("张三", cat);
		Person person2 = new Person("李四", dog);
		person1.speak();
		person2.speak();
	}
}
