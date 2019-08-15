package day02;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 获取当前的时间，然后输出明日此刻的时间(要求输出格式 xxxx年xx月xx日  上午/下午    xx时：xx分：xx秒   星期几 )。
 */
public class Test01 {

	public static void main(String[] args) {
		Date date=new Date();
		
		long da=date.getTime();
		
		da+=24*3600*1000;
		
		SimpleDateFormat si=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		
		date.setTime(da);
		String st=si.format(date);
		
		System.out.println("明日此刻的时间为："+st);
	}

}
