package modelDemo;

public class Warrior extends Hero{
	public Warrior() {
		super();
		setName("Ĭ��Ӣ��");
	}
	
	public Warrior(long id ,String name,int x,int y) {
		super(id,name);
		setX(x);
		setY(y);
	}
	@Override
	public boolean isFightByDistance(Hero hero) {
		double distance = getDistance(getX(), getY(), hero.getX(), hero.getY());
		
		return distance <=100;
	}

	@Override
	public void fight(Hero hero) {
		//1�������������
		//2��������Ӣ�۶����hp
		int attack = ((int)(Math.random()*1000))%51+20;
		setAttack(attack);
		hero.setHp(hero.getHp()-attack);
		
	}
	
}
