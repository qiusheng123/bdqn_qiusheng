package day01;

import java.util.Random;
import java.util.Scanner;

/*
 * 11��ϵͳ������ĸ����ȵ���֤��(�����֣���д��ĸ��Сд��ĸ���)��
 * �û��ڿ���̨������֤�룬�Ա���ϵͳ����֤���Ƿ�һ��(�����ִ�Сд)
 */
public class Test10 {
	public static void main(String[] args) {
		//�Ѵ�Сд��ĸ��������ȫ�������һ���ַ���
		String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		char[]arr=new char[4];
		for (int i = 0; i < arr.length; i++) {
			Random rand=new Random();
			int index=rand.nextInt(str.length());//����0��str����֮�������
			arr[i]=str.charAt(index);
		}
		//��ӡ������ɵ���֤��
		String result=String.valueOf(arr);
		System.out.println("��֤��Ϊ��"+result);
		
		Scanner input=new Scanner(System.in);
		System.out.print("��������֤�룺");
		String user=input.next();
		//���û���ϵͳ������֤�붼ת��Ϊ��д
		String str1=result.toUpperCase();
		String str2=user.toUpperCase();
		
		//�ж��û��������֤����ϵͳ���ɵ��Ƿ�һ�²���Ű��Сд
		if (str1.equals(str2)) {
			System.out.println("��֤��������ȷ��");
		}else {
			System.out.println("��֤����������");
		}
	}
	
	

}
