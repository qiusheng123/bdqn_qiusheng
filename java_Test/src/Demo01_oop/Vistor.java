package Demo01_oop;

public class Vistor {
	String name;//�ο�����
	int age;//�ο��꼶
	
	//�����ο����������Ʊ����
	public void showPrice() {
		if(age<=10) {
			System.out.println("��Ʊ���");
		}else if (age<=60) {
			System.out.println("��ƱȫƱ��"+20+"Ԫ");
		}else {
			System.out.println("��Ʊ��ۣ�"+10+"Ԫ");
		}
	}
}
