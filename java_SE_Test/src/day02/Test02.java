package day02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 2���Լ�����¼��һ��ʱ�䣬��ʽΪ"yyyy-MM-dd HH:mm:ss"��Ȼ��ֱ�������ʱ��ķ������꣬�£��ա�
���¼��������ַ�����ʽ���ԣ�������¼��ʱ��

 */
public class Test02 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��ʱ�䣬��ʽΪ��yyyy-MM-dd HH:mm:ss");
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
				System.out.println("�����ʽ���ԣ����������룺");
				continue;
			}
			
		} while (true);
		c.setTime(date);
		System.out.println("�꣺"+c.get(Calendar.YEAR)+" �£�"+(c.get(Calendar.MONTH)+1)+" ��:"+c.get(Calendar.DAY_OF_MONTH));	
	}

}
