package day7_18;

import java.util.Scanner;

public class Tirangle_test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Triangle tri=new Triangle();
	
		String str="y";		
		
		while("y".equals(str)) {//����y�������������α߳�
			System.out.print("�������һ���ߣ�");
			tri.a=input.nextInt();
			System.out.print("������ڶ����ߣ�");
			tri.b=input.nextInt();
			System.out.print("������������ߣ�");
			tri.c=input.nextInt();
			boolean istri=tri.isTirangle(tri.a,tri.b,tri.c);
			if (istri) {//�ж��Ƿ񹹳�������
				System.out.println(tri.shape(tri.a,tri.b,tri.c));
			} else {
				System.out.println("�ⲻ�ܹ���������");
			}
			System.out.print("������(y/n)��");
			str = input.next();	
		}
			
	}

}
