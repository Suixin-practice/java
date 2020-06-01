package studentDemo;

public class studentTest {
	public static void main(String[] args) {
		student Student = new student("张三", 41);
		Student.show();
		Undergraduate undergraduate = new Undergraduate("李四", 20, "计科");
		undergraduate.show();
	}
}
