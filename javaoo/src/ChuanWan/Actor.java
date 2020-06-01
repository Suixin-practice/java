package ChuanWan;
/**
 * 演员父类,abstract 抽象类，不可实例化
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
		System.out.println("演员"+ name +"正在表演");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
