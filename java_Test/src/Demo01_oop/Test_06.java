package Demo01_oop;

import java.util.Scanner;

public class Test_06 {
	public static void main(String[] args) {
		//创建一个用户
	Administrator user=new Administrator();
	user.name="admin";
	user.password="111111";
	
	//更新用户密码
	Scanner input=new Scanner(System.in);
	System.out.println("请输入用户名：");
	String userName=input.next();
	System.out.println("请输入密码：");
	String passWord=input.next();
	
	if (user.name.equals(userName)&&(user.password).equals(passWord)) {
		//更新密码
		System.out.println("请输入新密码：");
		user.password=input.next();	
		System.out.println("修改密码成功，新密码为："+user.password);
	  }
	else {
		System.out.println("您输入的用户和密码有误，无法获取更新密码权限！");
	}
	}
}
