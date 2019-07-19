package day7_18;
/*
 * 判断是否构成一个三角形
 */
import java.util.Scanner;

public class Triangle {
	 int a;
	 int b;
	 int c;
	
	//判断是否构成三角形
	public boolean isTirangle(int a,int b,int c) {
		boolean flag = false;
		
			if ((a + b) > c && (a + c) > b && (b + c) > a) {
				flag = true;
			}
			return flag;
	}

	//判断构成何种三角形
	public String shape(int a,int b,int c) {
		String shape = "";
		if (a == b && b == c) {
			shape = "这是一个等边三角形";
		} else if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (c * c + b * b == a * a)) {
			shape = "这是一个直角三角形";
		} else if ((a * a > b * b + c * c) || (b * b > c * c + a * a) || (c * c > b * b + a * a)) {
			shape = "这是一个钝角三角形";
		} else {
			shape = "这是一个锐角三角形";
		}
		return shape;
	}
}
