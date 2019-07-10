package Demo01_oop;

public class Test_03_01 {

	public static void main(String[] args) {
		Test_03 xw=new Test_03();
		xw.name="小王";
		xw.age=25;
		xw.sex="男";
		xw.classNo=01;
		xw.show1(xw.name,xw.age,xw.sex,xw.classNo);
		
		Test_03 xh=new Test_03();
		xh.name="小红";
		xh.age=25;
		xh.sex="女";
		xh.classNo=02;
		xh.show2();
	}

}
