package ChuanWan;

public class CrossActor extends Actor{

	public CrossActor() {
		super();
	}

	public CrossActor(String name) {
		super(name);
	}
	@Override
	public void perfroms() {
		System.out.println(getName()+"���ڿ�ʼ˵����");
	}
}
