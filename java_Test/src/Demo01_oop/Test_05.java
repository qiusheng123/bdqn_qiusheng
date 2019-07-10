package Demo01_oop;

import java.util.Arrays;
import java.util.Scanner;


public class Test_05 {
	public static void main(String[] args) {
		use();
	}
	public static void use() {
		String []user= {"admin1","111111"};
		Scanner input=new Scanner(System.in);
		
		String[]user1=new String[2];
		System.out.println("请出入您的用户名：");
		user1[0]=input.next();
		System.out.println("请输入您的密码：");
		user1[1]=input.next();
		boolean a=Arrays.equals(user, user1);
	
		if (a) {
			System.out.println("请输入新密码：");
			user[1]=input.next();
			System.out.println("修改成功，您的新密码为："+user[1]);
		}else {
			System.out.println("用户名和密码不匹配！您没有权限更新管理系统。");
		}
		
	}
}
