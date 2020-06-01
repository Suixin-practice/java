package ChuanWan;

import java.io.IOException;
import java.util.Properties;

public class ChunWanTest {
	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		Director 张艺谋 = new Director();
		Singer 宋祖英 = new Singer("宋祖英");
		Dancer 杨丽萍 = new Dancer("杨丽萍");
		张艺谋.action(宋祖英);
		张艺谋.action(杨丽萍);
		
		//模拟升级,添加相声模块，核心内容不变
		CrossActor 冯巩 = new CrossActor("冯巩");
		张艺谋.action(冯巩);
		//不允许创建字类，添加模块
		//使用反射+多态实现无缝升级
		Properties props = new Properties();//对应的配置文件
		props.load(ChunWanTest.class.getResourceAsStream("ActorConfig.properties"));
//		System.out.println(props.getProperty("crossactor"));
		//通过反射实例化配置文件中配置的类
		Actor actor = (Actor)Class.forName(props.getProperty("crossactor")).newInstance();
		actor.setName("郭德纲");
		张艺谋.action(actor);
	}
}
