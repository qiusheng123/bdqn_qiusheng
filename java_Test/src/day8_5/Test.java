package day8_5;
/*
 * ������ͼ�ζ�����������С����ж�������ͼ���ĸ�����������ġ�
 */
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		Figure []arr= {new Round(),new Square(),new IsoscelesRightTriangle()};
			double [] arr1= {arr[0].arer(),arr[1].arer(),arr[2].arer()};
			Arrays.sort(arr1);
			if (arr1[arr.length-1]==arr[0].arer()) {
				System.out.println("Բ��������");
			}else if (arr1[arr.length-1]==arr[1].arer()) {
				System.out.println("������������");
			}else {
				System.out.println("����ֱ��������������");
			}
	}

}
