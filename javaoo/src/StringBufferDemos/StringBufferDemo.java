package StringBufferDemos;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer strBuffer = new StringBuffer("你好！");
		StringBuffer strBuffer1 = new StringBuffer("你好！");
		StringBuffer strBuffer2 = new StringBuffer("你好！");
		//字符串反转
		System.out.println(strBuffer.reverse());
		//插入
		strBuffer.insert(3, "abc");
		System.out.println(strBuffer);
		//删除  [1,2)下标的元素
		strBuffer.delete(1,2);
		System.out.println(strBuffer);
		//修改
		strBuffer1.replace(2, 4, "北京");
		System.out.println(strBuffer1);
		
		strBuffer1.setCharAt(3, '神');
		System.out.println(strBuffer1);
		
		System.out.println(strBuffer1.capacity());
		
		//清空字符串
		strBuffer.setLength(0);
		//缓冲区
		strBuffer.trimToSize();
		//		final int N = 500000;
//		long startTime = System.currentTimeMillis();
//		String str="*";
//		for (int i = 0; i < N; i++) {
//			str +="*";
//		}
//		long endTime= System.currentTimeMillis();
//		System.out.println("+=用时"+(endTime-startTime)+"毫秒");
//	//使用stringBuffer进行字符串拼接
//	startTime = System.currentTimeMillis();//得到循环开始的时间
//	StringBuffer str1 = new StringBuffer("*");
//	for (int i = 0; i < N; i++) {
//		str1.append("*");
//	}
//	endTime= System.currentTimeMillis();//得到循环结束的时间
//	System.out.println(endTime-startTime);
//	
//	//stringBuilder
//	startTime = System.currentTimeMillis();//得到循环开始的时间
//	StringBuilder str2 = new StringBuilder("*");
//	for (int i = 0; i < N; i++) {
//		str2.append("*");
//	}
//	endTime= System.currentTimeMillis();//得到循环结束的时间
//	System.out.println(endTime-startTime);
//	
	}
}
