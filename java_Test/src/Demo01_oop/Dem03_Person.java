package Demo01_oop;

public class Dem03_Person {

	public static void main(String[] args) {
		
		//�������飺������һ��Person���͵����飻
		Person [] arrP=new Person[3];
		//arrP  �����ÿ��Ԫ�ض�Ӧ����Person���͵Ķ���
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
		
		//����Person����Ԫ��
		
		for (int i = 0; i < arrP.length; i++) {
			System.out.println(arrP[i].name+" "+arrP[i].age);
			//����ֱ�����arrP[1],��Ϊ�������ָ�����ĵ�ַ
		}
	}

}
