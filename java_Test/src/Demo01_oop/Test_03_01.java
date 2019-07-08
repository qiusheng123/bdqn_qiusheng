package Demo01_oop;

public class Test_03_01 {

	public static void main(String[] args) {
		Test_03 xw=new Test_03();
		xw.name="小王";
		xw.age=25;
		xw.sex="男";
		xw.num=01;
		System.out.println(xw.name+"  "+xw.age+"岁   "+"性别："+xw.sex+"  "+"学号："+xw.num);
		
		Test_03 xh=new Test_03();
		xh.name="小红";
		xh.age=25;
		xh.sex="女";
		xh.num=02;
		System.out.println(xh.name+"  "+xh.age+"岁   "+"性别："+xh.sex+"  "+"学号："+xh.num);
	}

}
