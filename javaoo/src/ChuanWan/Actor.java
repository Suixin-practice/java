package ChuanWan;
/**
 * ��Ա����,abstract �����࣬����ʵ����
 * @author 40623
 *
 */
public abstract class Actor {
	private String name;
	
	public Actor() {
		
	}
	public Actor(String name) {
		setName(name);
	}
	
	public void perfroms() {
		System.out.println("��Ա"+ name +"���ڱ���");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
