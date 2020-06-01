package pkgame;
/**
 * 实现了可攻击接口抽象类
 * @author 40623
 *
 */
public abstract class Hero implements Assailable {

	private long id;
	private String name;
	private int level;
	private int maxHp;
	private int hp;
	private int attack;
	private int x;
	private int y;
	
	public  Hero() {
		setMaxHp(100);
		setHp(100);
	}
	
	public Hero(long id,String name) {
		this();
		setId(id);
		setName(name);
	}
	/**
	 * 判断
	 * @param assa
	 */
	public void PK(Assailable assa) {
		if(canFightByDistance(assa)&&hp>0&&assa.getHP()>0) {
			fight(assa);
		}else {
			System.out.println("距离不够！！");
		}
		System.out.println("当前状态");
		System.out.println("昵称\tHP\tX坐标\tY坐标\t");
		System.out.println(name+"\t"+hp+"\t"+x+"\t"+y);
		System.out.printf("%s\t%d\t%d\t%d",assa.getName(),assa.getHP(),assa.getx(),assa.gety());
}	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	} 
	
	
}
