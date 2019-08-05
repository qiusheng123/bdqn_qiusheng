package day8_5;
/*
 * 将三个图形对象放入数组中。并判断这三个图像，哪个的面积是最大的。
 */
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		Figure []arr= {new Round(),new Square(),new IsoscelesRightTriangle()};
			double [] arr1= {arr[0].arer(),arr[1].arer(),arr[2].arer()};
			Arrays.sort(arr1);
			if (arr1[arr.length-1]==arr[0].arer()) {
				System.out.println("圆形面积最大");
			}else if (arr1[arr.length-1]==arr[1].arer()) {
				System.out.println("正方形面积最大");
			}else {
				System.out.println("等腰直角三角形面积最大");
			}
	}

}
