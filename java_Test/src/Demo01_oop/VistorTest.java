package Demo01_oop;

import java.util.Scanner;

/*
 * 根据不同的游客类的年龄，计算门票费用。
门票规则：10岁及以下，门票免费；10—60岁，门票全票；超过60岁，门票半价

 */
public class VistorTest {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String answer=null;
		do {
			Vistor vistor=new Vistor();
			System.out.print("请输入姓名：");
			vistor.name=input.next();
			System.out.print("请输入年龄：");
			vistor.age=input.nextInt();			
			vistor.showPrice();
			
			System.out.println("是否继续（y/n）");
		    answer=input.next();
		    			
		} while ("y".equals(answer));//answer.equals("y")最好用确定的字符串调用equals方法：
														//不然可能存在空指针异常。
		
	}

}
