package classs;
/**
 * ����
 * 1811610014
 */
abstract class Animal {
	abstract void shout();
}
class Dog extends Animal{
	@Override
	void shout() {
		System.out.println("����");
	}
	public void eatBone() {
		System.out.println("��ϲ���й�ͷ");
	}
}
class Cat extends Animal{
	@Override
	void shout() {
		System.out.println("����");	
	}
	public void catchMouse() {
		System.out.println("è׽����");
	}
}