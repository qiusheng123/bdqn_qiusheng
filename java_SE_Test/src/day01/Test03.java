package day01;
/*
 * ���ַ���"  baidu  ",������ַ���ƴ�ӳ�www.baidu.com
 */
public class Test03 {
	public static void main(String[] args) {
		String str="  baidu  ";
		String str1=str.trim();
		
		StringBuilder str2= new StringBuilder(str1);
		//׷��.com
		str2.append(".com");
		
		//����www.
		str2.insert(0, "www.");
		
		//ת��ΪString����
		String st=str2.toString();
		
		System.out.println(st);
		
	}
}
