package Demo01_oop;

public class Test_03 {
	String name;
	int age;
	String sex;
	int classNo;
public void show(Test_03 stu) {
		System.out.println(stu.name+" "+stu.age+" "+stu.sex+" "+stu.classNo);
	}
/*
 * 参数名name,age,sex,classNo，并不是对应的属性名
 * 只不过跟属性名长得像而已
 */
public void show1(String name,int age,String sex,int classNo) {
	System.out.println(name+" "+age+" "+sex+" "+classNo);//参数名可以随便取。
}

public void show2() {
	System.out.println(name+" "+age+" "+sex+" "+classNo);//属性名
}

}
