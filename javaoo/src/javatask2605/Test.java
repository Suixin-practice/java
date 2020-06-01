package javatask2605;

public class Test {
	public static void main(String[] args) {
		Human m = new Man("李白", 10);
		m.speak();
		Human w = new Woman("潘金莲", 20);
		w.getInfo("潘金莲", 20);
		w.speak();
		try {
			Woman w1 = (Woman)m;
		} catch (Exception e) {
			System.out.println("该对象不是女的");
		}
	}
}
