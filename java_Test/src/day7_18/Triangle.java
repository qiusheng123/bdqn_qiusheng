package day7_18;
/*
 * �ж��Ƿ񹹳�һ��������
 */
import java.util.Scanner;

public class Triangle {
	 int a;
	 int b;
	 int c;
	
	//�ж��Ƿ񹹳�������
	public boolean isTirangle(int a,int b,int c) {
		boolean flag = false;
		
			if ((a + b) > c && (a + c) > b && (b + c) > a) {
				flag = true;
			}
			return flag;
	}

	//�жϹ��ɺ���������
	public String shape(int a,int b,int c) {
		String shape = "";
		if (a == b && b == c) {
			shape = "����һ���ȱ�������";
		} else if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (c * c + b * b == a * a)) {
			shape = "����һ��ֱ��������";
		} else if ((a * a > b * b + c * c) || (b * b > c * c + a * a) || (c * c > b * b + a * a)) {
			shape = "����һ���۽�������";
		} else {
			shape = "����һ�����������";
		}
		return shape;
	}
}
