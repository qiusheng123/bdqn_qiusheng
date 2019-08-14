package day01;

import java.util.Random;
import java.util.Scanner;

/*
 * 11、系统随机了四个长度的验证码(由数字，大写字母，小写字母组成)。
 * 用户在控制台输入验证码，对比与系统的验证码是否一致(不区分大小写)
 */
public class Test10 {
	public static void main(String[] args) {
		//把大小写字母还有数字全部定义成一个字符串
		String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		char[]arr=new char[4];
		for (int i = 0; i < arr.length; i++) {
			Random rand=new Random();
			int index=rand.nextInt(str.length());//返回0到str长度之间的数字
			arr[i]=str.charAt(index);
		}
		//打印随机生成的验证码
		String result=String.valueOf(arr);
		System.out.println("验证码为："+result);
		
		Scanner input=new Scanner(System.in);
		System.out.print("请输入验证码：");
		String user=input.next();
		//将用户和系统生成验证码都转换为大写
		String str1=result.toUpperCase();
		String str2=user.toUpperCase();
		
		//判断用户输入的验证码与系统生成的是否一致不考虐大小写
		if (str1.equals(str2)) {
			System.out.println("验证码输入正确！");
		}else {
			System.out.println("验证码输入有误！");
		}
	}
	
	

}
