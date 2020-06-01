package ChouXiang;

public class FruitImpl {
	public static void main(String[] args) {
		Apple a = new Apple();
		a.eat();
		Cola c = new Cola();
		c.drink();
	}
}

class Apple implements IFruit{
	public void eat() {
		System.out.println("西瓜很好吃");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}
}
class Cola implements IFruit{
	public void drink() {
		System.out.println("雪碧很好喝");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}
