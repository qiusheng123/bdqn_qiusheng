package day01;
/*
 * 判断"123456789"是否是回文（利用charAt方法）
 */
public class Test04 {
	public static void main(String[] args) {
		String str="123456789";
		
		for (int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				System.out.println("该字符串不是回文");
				return;
			}
		}
		System.out.println("该字符串是回文");
	}
}
