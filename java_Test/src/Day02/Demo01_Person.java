package Day02;
/*
 * 类中包含两个部分
 * 	。成员变量：定义在类中，方法外的变量。如果不赋值，有默认的值。
 *  。成员方法：定义在类中的方法。
 *  内部类（暂时不了解）
 */
public class Demo01_Person {
	//定义成员变量
	String name;//名字
	String age;//年龄
	String sex;//性别
	
	//定义成员方法
	public void work() {
		System.out.println(name+"的工作理念，干活挣钱吃饭");
	}
	
	public void show(int hight) {//方法中定义的参数称为形参。
		System.out.println("身高"+hight);
	}
	
	
	public static void main(String[] args) {
		Demo01_Person person=new Demo01_Person();
		//调用方法时，传入的参数，叫做实际参数，简称实参。
		person.show(170);
	}
}
