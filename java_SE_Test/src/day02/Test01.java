package day02;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��ȡ��ǰ��ʱ�䣬Ȼ��������մ˿̵�ʱ��(Ҫ�������ʽ xxxx��xx��xx��  ����/����    xxʱ��xx�֣�xx��   ���ڼ� )��
 */
public class Test01 {

	public static void main(String[] args) {
		Date date=new Date();
		
		long da=date.getTime();
		
		da+=24*3600*1000;
		
		SimpleDateFormat si=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		
		date.setTime(da);
		String st=si.format(date);
		
		System.out.println("���մ˿̵�ʱ��Ϊ��"+st);
	}

}
