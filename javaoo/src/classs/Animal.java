package classs;
/**
 * ËåĞÄ
 * 1811610014
 */
abstract class Animal {
	abstract void shout();
}
class Dog extends Animal{
	@Override
	void shout() {
		System.out.println("ÍôÍô");
	}
	public void eatBone() {
		System.out.println("¹·Ï²»¶¿Ğ¹ÇÍ·");
	}
}
class Cat extends Animal{
	@Override
	void shout() {
		System.out.println("ß÷ß÷");	
	}
	public void catchMouse() {
		System.out.println("Ã¨×½ÀÏÊó");
	}
}