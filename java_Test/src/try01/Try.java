package try01;

import java.util.Scanner;

public class Try {
	public static void show()throws Exception{
	Scanner input = new Scanner(System.in);
	
	   System.out.println("������γ̴����(1~3֮�������)");
		int num=input.nextInt();
		switch (num) {
		case 1:
			System.out.println("C#���");
			break;
		case 2:
			System.out.println("Java���");
			break;
		case 3:
			System.out.println("SQL����");
			break;
		default:
			System.out.println("�Ƿ�����");
			break;
		}
	}
	
	public static void main(String[] args) {
		try {
			show();
		} catch (Exception e) {
			System.out.println("�������Ϊ1~3֮�������");
		}
	}
}

