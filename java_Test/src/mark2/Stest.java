package mark2;

import day7_30.Student;

public class Stest extends Student{
 
	//不同包访问sex
	public Stest(String sex) {
		super(sex);
	}

	public static void main(String[] args) {
		
		S s=new S();
//		s.weight=70; final修饰的变量的值不能被修改
		S.size=60;//可以被修改
			
	}

}
