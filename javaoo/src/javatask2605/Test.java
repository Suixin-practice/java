package javatask2605;

public class Test {
	public static void main(String[] args) {
		Human m = new Man("���", 10);
		m.speak();
		Human w = new Woman("�˽���", 20);
		w.getInfo("�˽���", 20);
		w.speak();
		try {
			Woman w1 = (Woman)m;
		} catch (Exception e) {
			System.out.println("�ö�����Ů��");
		}
	}
}
