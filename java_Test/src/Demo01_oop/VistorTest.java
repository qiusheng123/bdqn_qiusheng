package Demo01_oop;

import java.util.Scanner;

/*
 * ���ݲ�ͬ���ο�������䣬������Ʊ���á�
��Ʊ����10�꼰���£���Ʊ��ѣ�10��60�꣬��ƱȫƱ������60�꣬��Ʊ���

 */
public class VistorTest {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String answer=null;
		do {
			Vistor vistor=new Vistor();
			System.out.print("������������");
			vistor.name=input.next();
			System.out.print("���������䣺");
			vistor.age=input.nextInt();			
			vistor.showPrice();
			
			System.out.println("�Ƿ������y/n��");
		    answer=input.next();
		    			
		} while ("y".equals(answer));//answer.equals("y")�����ȷ�����ַ�������equals������
														//��Ȼ���ܴ��ڿ�ָ���쳣��
		
	}

}
