package day01;
/*
 * 12、在一个字符串“0”，循环十次。(使用stringBuilder，避免多次创建对象)
 */
public class Test12 {
	public static void main(String[] args) {
		String str="0";
		StringBuilder sb=new StringBuilder(str);
		for (int i = 1; i <=10; i++) {
			sb.append(i);
			String str1=sb.toString();
			System.out.println("第"+i+"次："+str1);
		}
		
	}
}
