package Demo01_oop;

public class Test_02_01 {
	public static void main(String[] args) {
		Test_02 ch=new Test_02();
		ch.name="�º�";
		ch.age=20;
		ch.weight=60;
		ch.sex="��";
		System.out.println(ch.name+"  "+ch.age+"�� "+ch.weight+"kg "+"�Ա�"+ch.sex);
		ch.study("���������Σ��������ֿΣ�");
		
		Test_02 zhh=new Test_02();
		zhh.name="�Ż���";
		zhh.age=27;
		zhh.weight=48;
		zhh.sex="Ů";
		System.out.println(zhh.name+"  "+zhh.age+"�� "+zhh.weight+"kg "+"�Ա�"+zhh.sex);
		ch.study("������ѧ�Σ����翪��ᣡ");
		
	}
}
