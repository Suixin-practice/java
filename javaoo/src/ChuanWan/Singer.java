package ChuanWan;
/**
 * ������Ա��
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
		System.out.println("�質��Ա"+getName()+"���ڱ���");
	}
}
