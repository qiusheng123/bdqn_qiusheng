package day02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 2、自己键盘录入一个时间，格式为"yyyy-MM-dd HH:mm:ss"。然后分别输出这个时间的分量：年，月，日。
如果录入的日期字符串格式不对，可重新录入时间

 */
public class Test02 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个时间，格式为：yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat si=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();
		String time=null;
		Date date=null;
		do {
			time=input.nextLine();
			try {
				date=si.parse(time);
				break;
			} catch (Exception e) {
				System.out.println("输入格式不对，请重新输入：");
				continue;
			}
			
		} while (true);
		c.setTime(date);
		System.out.println("年："+c.get(Calendar.YEAR)+" 月："+(c.get(Calendar.MONTH)+1)+" 日:"+c.get(Calendar.DAY_OF_MONTH));	
	}

}
