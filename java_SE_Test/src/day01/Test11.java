package day01;

import java.util.Scanner;

/*
 * 12������¼��һ���ַ�����ͳ�Ƹ��ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���,�����ַ����ֵĴ�����
 */
public class Test11 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������ַ�����");
		String str=input.next();
		
		//���ַ���ת��Ϊ�ַ�����
		char[]str1=str.toCharArray();
		
		int a=0;//��¼���ִ�д��ĸ����
		int b=0;//��¼����Сд��ĸ����
		int c=0;//��¼�������ִ���
		int d=0;//��¼���ַ��Ŵ���
		for (int i = 0; i < str1.length; i++) {
			if(Character.isUpperCase(str1[i])) {//�жϴ�д��ĸ
				a++;
			}else if(Character.isLowerCase(str1[i])){//�ж�Сд��ĸ
				b++;
			}else if (Character.isDigit(str1[i])) {//�ж�����
				c++;
			}else {									//�жϷ���
				d++;
			}
		}
		System.out.println(str+"�г��ִ�д��ĸ:"+a+"�� ,"+"Сд��ĸ:"+b+"��,"
								+"����:"+c+"��, ����:"+d+"��");
	}
}
