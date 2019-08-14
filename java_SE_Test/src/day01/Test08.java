package day01;

import java.util.Scanner;

/*
 * 9、会员注册
要求：
·用户名长度不小于3
·密码长度不小于6
·注册时两次输入密码必须相同

 */
public class Test08 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean flag=true;
		System.out.println("***欢迎进入注册系统***");
		
		do {
			
			System.out.print("请输入用户名：");
			String name=input.next();
			
			System.out.print("请输入密码：");
			String passWord1=input.next();
			
			System.out.print("请再次输入密码：");
			String passWord2=input.next();
			if (name.length()>=3&&passWord1.length()>=6&&passWord2.length()>=6
					&&passWord1.equals(passWord2)) {
				System.out.println("注册成功！请牢记用户名和密码！");
				flag=false;
				
			}else if(passWord1.equals(passWord2)==false){
				System.out.println("两次输入的密码不同请重新输入！");
			}else {
				System.out.println("用户长度不能小于3，密码长度不能小于6");
			}
			
		} while (flag);
	}
}
