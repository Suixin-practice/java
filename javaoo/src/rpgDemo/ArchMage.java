package rpgDemo;

public class ArchMage extends Hero{
	private int magicAttack;
	public static int ID=1;
	public ArchMage() {
		setNickName("默认法师"+ID);
		setLevel(1);
		setCurrLife(100);
		setMaxLife(100);
		setMagicAttack(99);
		ID++;
	}
	
	public ArchMage(String nickName) {
		this();//调用本类默认构造
		setNickName(nickName);
	}
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append(getLevel());
		str.append("\t");
		str.append(getNickName());
		str.append("\t");
		str.append(getMaxLife());
		str.append("\t");
		str.append(getCurrLife());
		str.append("\t");
		str.append(getMagicAttack());
		return str.toString();
	}
	public int getMagicAttack() {
		return magicAttack;
	}
	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}
	public void biuBiuBiu() {
		System.out.println(getNickName()+"放技能");
	}
}
