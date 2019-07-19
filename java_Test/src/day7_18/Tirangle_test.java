package day7_18;

import java.util.Scanner;

public class Tirangle_test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Triangle tri=new Triangle();
	
		String str="y";		
		
		while("y".equals(str)) {//输入y继续输入三角形边长
			System.out.print("请输入第一条边：");
			tri.a=input.nextInt();
			System.out.print("请输入第二条边：");
			tri.b=input.nextInt();
			System.out.print("请输入第三条边：");
			tri.c=input.nextInt();
			boolean istri=tri.isTirangle(tri.a,tri.b,tri.c);
			if (istri) {//判断是否构成三角形
				System.out.println(tri.shape(tri.a,tri.b,tri.c));
			} else {
				System.out.println("这不能构成三角形");
			}
			System.out.print("继续吗？(y/n)：");
			str = input.next();	
		}
			
	}

}
