package Day02;
/*
 * 编写Java程序用于显示人的姓名和年龄。 定义一个人类Person该类中应该有两个属性：姓名name和年龄age。
 */
public class Person {
	 String name;//姓名
	 int age;//年龄
	 public Person(String name,int age) {//初始化
		 this.name=name;
		 this.age=age;
	 }
	 
	 public void display() {
		System.out.println("姓名："+name+" "+"年级："+age);
	}
	 public static void main(String[] args) {
		Person person=new Person("兰溪", 18);
		person.display();
	}
}
