package rpgDemo;

public class Hero {
	private String nickName;
	private int level;
	private int maxLife;
	private int currLife;
	
	public Hero() {
		super();
	}
	public Hero(String nickName, int level, int maxLife, int currLife) {
		super();
		this.nickName = nickName;
		this.level = level;
		this.maxLife = maxLife;
		this.currLife = currLife;
	}
	public int compareTo(Hero hero) {
		if(this.level > hero.getLevel()) {
			return 1;
		}else if(this.level == hero.getLevel()) {
			return 0;
		}else {
			return -1;
		}
	}
	public int  compareTobyName(Hero hero) {
		return getNickName().compareTo(hero.getNickName());
	}
	public void move() {
//		System.out.println("move·½·¨");
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMaxLife() {
		return maxLife;
	}
	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}
	public int getCurrLife() {
		return currLife;
	}
	public void setCurrLife(int currLife) {
		this.currLife = currLife;
	}
}
