package chouxiangDemo;

import java.util.Date;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) throws ParseException {
		//Calendar��һ�������࣬һ��������gregorianCalendarʵ��
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getClass());
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int milliSecond = cal.get(Calendar.MILLISECOND);
		System.out.println("��ǰʱ�䣺");
		String str = String.format("%d-%02d-%d %02d-%02d-%d:%s", 
					year,month,day,hour,minute,second,milliSecond
				);
		System.out.println(str);
		
//		//Ϊ���������趨ʱ��
//		cal.set(2012, 5, 12, 14, 28,4);
//		Date date = cal.getTime();
//		System.out.println(date.toLocaleString());
//		//���ڸ�ʽ����
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
//		String strDate = format.format(date);
//		System.out.println(strDate);
//		//���ַ���ת��ΪDate����
//		Date newDate = 
//				format.parse("2017-12-30 24:59:59:9999");
//		System.out.println(newDate.toLocaleString());
		GregorianCalendar cal2 = new GregorianCalendar(2017,8,18);
		long diff = cal.getTimeInMillis()-cal2.getTimeInMillis();
		int diffDays = (int)diff / 1000 /60/60/24;
		System.out.println("���"+diffDays+"��");
		
		
	}
}
