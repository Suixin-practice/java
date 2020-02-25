package javaoo;

public class Demo1 {
	
	public String name;
	public int level;
	public String job;
	public Demo1(String name1,int level1,String job1) {
		name= name1;
		level = level1;
		job = job1;
	}
	public void show() {
		System.out.println(name + "\t" + level +"\t" + job);
	}
	public void doSkill(String name) {
		if(name.equals("劳拉")) {
			System.out.println("劳拉的技能");
		}else if(name.equals("孙悟空")) {
			System.out.println("吃俺老孙一棒");
		}
	}
}
