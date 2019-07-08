package Demo01_oop;
/*
 * 有一个计算器，能做两个数字加法运算和三个数字的加法
 */
public class test01 {

	public int getSum1(int num1,int num2) {
		return num1+num2;
	}
	public int getSum2(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	public static void main(String[] args) {
		test01 cal=new test01();
		cal.getSum1(1, 2);
		cal.getSum2(1, 2, 3);
	}
}
