package Demo01_oop;

public class Dem03_Person {

	public static void main(String[] args) {
		
		//对象数组：声明了一个Person类型的数组；
		Person [] arrP=new Person[3];
		//arrP  数组的每个元素都应该是Person类型的对象
		Person p1=new Person();
		p1.name="Jerry";
		p1.age=15;
		arrP[0]=p1;
		
		Person p2=new Person();
		p2.name="Jack";
		p2.age=18;
		arrP[1]=p2;
	    Person p3=new Person();
		p3.name="Mary";
		p3.age=14;
		arrP[2]=p3;
		
		//遍历Person数组元素
		
		for (int i = 0; i < arrP.length; i++) {
			System.out.println(arrP[i].name+" "+arrP[i].age);
			//不能直接输出arrP[1],因为输出的是指向对象的地址
		}
	}

}
