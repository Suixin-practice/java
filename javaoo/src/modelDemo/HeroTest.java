package modelDemo;

public class HeroTest {
	public static void main(String[] args) {
		Hero hero1 = new Warrior(1, "¸ÇÂ×", 0, 0);
		Hero hero2 = new Warrior(2, "õõ²õ", 50, 50);
		hero1.PK(hero2);
	}
}
