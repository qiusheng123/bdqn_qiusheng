package day01;

import java.util.Scanner;

/*
 * 12、键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数,其他字符出现的次数。
 */
public class Test11 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str=input.next();
		
		//将字符串转换为字符数组
		char[]str1=str.toCharArray();
		
		int a=0;//记录出现大写字母次数
		int b=0;//记录出现小写字母次数
		int c=0;//记录出现数字次数
		int d=0;//记录出现符号次数
		for (int i = 0; i < str1.length; i++) {
			if(Character.isUpperCase(str1[i])) {//判断大写字母
				a++;
			}else if(Character.isLowerCase(str1[i])){//判断小写字母
				b++;
			}else if (Character.isDigit(str1[i])) {//判断数字
				c++;
			}else {									//判断符号
				d++;
			}
		}
		System.out.println(str+"中出现大写字母:"+a+"个 ,"+"小写字母:"+b+"个,"
								+"数字:"+c+"个, 符号:"+d+"个");
	}
}
