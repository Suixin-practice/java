package ExceptionDemo;

import java.io.File;

/**
 * �ؼ��쳣
 * @author 40623
 *
 */
public class CheckedException {
	public static void main(String[] args) {
		File file = new File("C:/test.txt");
		//�ж��ļ��Ƿ����
		System.out.println(file.exists());
	}
}
