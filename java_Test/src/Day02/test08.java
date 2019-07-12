package Day02;

import java.sql.Date;
import java.text.SimpleDateFormat;


/*
 * 8、创建一个工具类，以后可以使用这个工具类，提供一下功能：
1、通过传入整数x,返回随机1—x的随机数。[1,x]
2、获取当前系统时间。 （核心代码System.currentTimeMillis()）
3、1到整数x的求和。
4、整数x的阶乘

 */
public class test08 {
	public int mathRandom(int x) {//通过传入整数x,返回随机1—x的随机数。[1,x]
		int num=(int)(Math.random()*x+1);
		return num;
	}
	
	public String SystemTime() {//获取当前系统时间。 
		Date date=new Date(System.currentTimeMillis());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd/hh/mm/ss");
		return sdf.format(date);
	}
	
	public int getSum(int x) {//1到整数x的求和
		int sum=0;
		for (int i = 1; i <=x ; i++) {
			sum+=i;
		}
		return sum;
	}
	
	public int getProduct(int x) {//整数x的阶乘
		int sum=1;
		for (int i = 1; i <=x ; i++) {
			sum*=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		test08 test=new test08();
		System.out.println("1~10之间的随机数："+test.mathRandom(10));
		System.out.println("当前时间："+test.SystemTime());
		System.out.println("1~10之间的整数之和："+test.getSum(10));
		System.out.println("5的阶乘："+test.getProduct(5));
	}
}
