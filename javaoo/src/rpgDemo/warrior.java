package rpgDemo;
//�̳�Hero
public class warrior extends Hero {
	//սʿ��������
	private int pysicalAttach;
	public static int ID =1;
	public warrior(String nickName,int pysicalAttach) {
		setNickName(nickName);
		setPysicalAttach(pysicalAttach);
	}
	@Override//��д���෽��
	public void move() {
		// TODO Auto-generated method stub
		super.move();
	}
	public warrior() {
		setNickName("Ĭ��սʿ"+ID);
		setLevel(1);
		setCurrLife(100);
		setMaxLife(100);
		setPysicalAttach(99);
		ID++;
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
		str.append(getPysicalAttach());
		return str.toString();
	}
	public int getPysicalAttach() {
		return pysicalAttach;
	}

	public void setPysicalAttach(int pysicalAttach) {
		this.pysicalAttach = pysicalAttach;
	}
	
}
