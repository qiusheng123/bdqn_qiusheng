package day01;

import java.util.Scanner;

/*
 * 9����Աע��
Ҫ��
���û������Ȳ�С��3
�����볤�Ȳ�С��6
��ע��ʱ�����������������ͬ

 */
public class Test08 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean flag=true;
		System.out.println("***��ӭ����ע��ϵͳ***");
		
		do {
			
			System.out.print("�������û�����");
			String name=input.next();
			
			System.out.print("���������룺");
			String passWord1=input.next();
			
			System.out.print("���ٴ��������룺");
			String passWord2=input.next();
			if (name.length()>=3&&passWord1.length()>=6&&passWord2.length()>=6
					&&passWord1.equals(passWord2)) {
				System.out.println("ע��ɹ������μ��û��������룡");
				flag=false;
				
			}else if(passWord1.equals(passWord2)==false){
				System.out.println("������������벻ͬ���������룡");
			}else {
				System.out.println("�û����Ȳ���С��3�����볤�Ȳ���С��6");
			}
			
		} while (flag);
	}
}
