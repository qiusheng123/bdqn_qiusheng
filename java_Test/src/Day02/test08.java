package Day02;

import java.sql.Date;
import java.text.SimpleDateFormat;


/*
 * 8������һ�������࣬�Ժ����ʹ����������࣬�ṩһ�¹��ܣ�
1��ͨ����������x,�������1��x���������[1,x]
2����ȡ��ǰϵͳʱ�䡣 �����Ĵ���System.currentTimeMillis()��
3��1������x����͡�
4������x�Ľ׳�

 */
public class test08 {
	public int mathRandom(int x) {//ͨ����������x,�������1��x���������[1,x]
		int num=(int)(Math.random()*x+1);
		return num;
	}
	
	public String SystemTime() {//��ȡ��ǰϵͳʱ�䡣 
		Date date=new Date(System.currentTimeMillis());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd/hh/mm/ss");
		return sdf.format(date);
	}
	
	public int getSum(int x) {//1������x�����
		int sum=0;
		for (int i = 1; i <=x ; i++) {
			sum+=i;
		}
		return sum;
	}
	
	public int getProduct(int x) {//����x�Ľ׳�
		int sum=1;
		for (int i = 1; i <=x ; i++) {
			sum*=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		test08 test=new test08();
		System.out.println("1~10֮����������"+test.mathRandom(10));
		System.out.println("��ǰʱ�䣺"+test.SystemTime());
		System.out.println("1~10֮�������֮�ͣ�"+test.getSum(10));
		System.out.println("5�Ľ׳ˣ�"+test.getProduct(5));
	}
}
