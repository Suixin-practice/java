package ChuanWan;
/**
 * 唱歌演员类
 * @author 40623
 *
 */
public class Singer extends Actor {

	public Singer() {
		super();
	}

	public Singer(String name) {
		super(name);
	}
	
	@Override
	public void perfroms() {
		System.out.println("歌唱演员"+getName()+"正在表演");
	}
}
