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
 * ������name,age,sex,classNo�������Ƕ�Ӧ��������
 * ֻ���������������������
 */
public void show1(String name,int age,String sex,int classNo) {
	System.out.println(name+" "+age+" "+sex+" "+classNo);//�������������ȡ��
}

public void show2() {
	System.out.println(name+" "+age+" "+sex+" "+classNo);//������
}

}
