package Demo01_oop;
/*
 * ��һ���������������������ּӷ�������������ֵļӷ�
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
