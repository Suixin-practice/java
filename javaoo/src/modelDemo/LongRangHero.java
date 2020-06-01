package modelDemo;

public abstract class LongRangHero extends Hero{
	private int attackRange;

	public LongRangHero() {
		super();
	}
	
	public LongRangHero(long id,String name,int attackRange,int x,int y) {
		super(id,name);
		setAttackRange(attackRange);
		setX(x);
		setY(y);
	}
	public int getAttackRange() {
		return attackRange;
	}

	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}
	
}
