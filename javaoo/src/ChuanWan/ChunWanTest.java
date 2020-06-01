package ChuanWan;

import java.io.IOException;
import java.util.Properties;

public class ChunWanTest {
	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		Director ����ı = new Director();
		Singer ����Ӣ = new Singer("����Ӣ");
		Dancer ����Ƽ = new Dancer("����Ƽ");
		����ı.action(����Ӣ);
		����ı.action(����Ƽ);
		
		//ģ������,�������ģ�飬�������ݲ���
		CrossActor �빮 = new CrossActor("�빮");
		����ı.action(�빮);
		//�����������࣬���ģ��
		//ʹ�÷���+��̬ʵ���޷�����
		Properties props = new Properties();//��Ӧ�������ļ�
		props.load(ChunWanTest.class.getResourceAsStream("ActorConfig.properties"));
//		System.out.println(props.getProperty("crossactor"));
		//ͨ������ʵ���������ļ������õ���
		Actor actor = (Actor)Class.forName(props.getProperty("crossactor")).newInstance();
		actor.setName("���¸�");
		����ı.action(actor);
	}
}
