package Day02;
/*
 * ���а�����������
 * 	����Ա���������������У�������ı������������ֵ����Ĭ�ϵ�ֵ��
 *  ����Ա���������������еķ�����
 *  �ڲ��ࣨ��ʱ���˽⣩
 */
public class Demo01_Person {
	//�����Ա����
	String name;//����
	String age;//����
	String sex;//�Ա�
	
	//�����Ա����
	public void work() {
		System.out.println(name+"�Ĺ�������ɻ���Ǯ�Է�");
	}
	
	public void show(int hight) {//�����ж���Ĳ�����Ϊ�βΡ�
		System.out.println("���"+hight);
	}
	
	
	public static void main(String[] args) {
		Demo01_Person person=new Demo01_Person();
		//���÷���ʱ������Ĳ���������ʵ�ʲ��������ʵ�Ρ�
		person.show(170);
	}
}
