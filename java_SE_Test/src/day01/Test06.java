package day01;
/*
 * 7、利用StringBuilder的反转方法，判断给定的字符串是否为回文(字符串自定义)
 */
public class Test06 {
	public static void main(String[] args) {
		String str="期归梦还梦归期";
		StringBuilder sb=new StringBuilder(str);
		StringBuilder st=sb.reverse();
		
		String str1=str.toString();
		if (str1.equals(str)) {
			System.out.println("该字符串是回文");
		}else {
			System.out.println("该字符串不是回文");
		}
	}
}
