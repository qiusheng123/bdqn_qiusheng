package try01;

import java.util.Scanner;

public class Try {
	public static void show()throws Exception{
	Scanner input = new Scanner(System.in);
	
	   System.out.println("请输入课程代表号(1~3之间的数字)");
		int num=input.nextInt();
		switch (num) {
		case 1:
			System.out.println("C#编程");
			break;
		case 2:
			System.out.println("Java编程");
			break;
		case 3:
			System.out.println("SQL基础");
			break;
		default:
			System.out.println("非法输入");
			break;
		}
	}
	
	public static void main(String[] args) {
		try {
			show();
		} catch (Exception e) {
			System.out.println("输入必须为1~3之间的整数");
		}
	}
}

