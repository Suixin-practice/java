package ExceptionDemo;

import java.io.File;

/**
 * 必检异常
 * @author 40623
 *
 */
public class CheckedException {
	public static void main(String[] args) {
		File file = new File("C:/test.txt");
		//判断文件是否存在
		System.out.println(file.exists());
	}
}
