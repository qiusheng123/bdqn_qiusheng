package day01;

import java.util.Scanner;

/* 
 * 8、自定义一个字符串。用户键盘录入一个字符。判断该字符是否在自定义的字符串中（使用toCharArray方法）
 */
public class Test07 {
	public static void main(String[] args) {
		String str="影弄花枝花弄影，丝牵柳线柳牵丝。";
		char[]st=str.toCharArray();
		
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个字符：");
		
		String str1=input.next();
		boolean flag=false;
		for (int i = 0; i < st.length; i++) {
			if (st[i]==str.charAt(0)) {
				flag=true;
				break;
			}
		}
		if (flag) {
			System.out.println("字符"+str.charAt(0)+"在自定义字符串中");
		}else {
			System.out.println("字符"+str.charAt(0)+"不在自定义字符串中");
		}
		
	}
}
