package day7_30;
/*
 * 有类Student，属性sex被protected修饰。
现有子类PostGradute。

 */
public class Student {
	String name;
	protected String sex;
	
	public Student(String sex) {
		this.sex=sex;
	}
}

