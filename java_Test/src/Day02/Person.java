package Day02;
/*
 * ��дJava����������ʾ�˵����������䡣 ����һ������Person������Ӧ�����������ԣ�����name������age��
 */
public class Person {
	 String name;//����
	 int age;//����
	 public Person(String name,int age) {//��ʼ��
		 this.name=name;
		 this.age=age;
	 }
	 
	 public void display() {
		System.out.println("������"+name+" "+"�꼶��"+age);
	}
	 public static void main(String[] args) {
		Person person=new Person("��Ϫ", 18);
		person.display();
	}
}
