package day01;
/*
 * 有字符串"  baidu  ",将这个字符串拼接成www.baidu.com
 */
public class Test03 {
	public static void main(String[] args) {
		String str="  baidu  ";
		String str1=str.trim();
		
		StringBuilder str2= new StringBuilder(str1);
		//追加.com
		str2.append(".com");
		
		//插入www.
		str2.insert(0, "www.");
		
		//转换为String类型
		String st=str2.toString();
		
		System.out.println(st);
		
	}
}
