package day01;
/*
 * 2����һ���ַ���www.baidu.com �����ȡ�������ַ������ֱ�Ϊ baidu     com
 */
public class Test02 {
	public static void main(String[] args) {
		String str="www.baidu.com";
		
		String str1=str.substring(4, 9);
		String str2=str.substring(10);
		
		System.out.println(str1+"   "+str2);
	}
}
