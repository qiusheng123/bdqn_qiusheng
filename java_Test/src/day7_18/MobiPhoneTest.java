package day7_18;

public class MobiPhoneTest {
/*
 * ��ʼ�����󣬸�brand��ֵ������Ҫ�����в����Ĺ��췽�����������������,����һ��ƻ�����ӵ��ֻ��ɣ���
 */
	public static void main(String[] args) {
		MobiPhone mp=new MobiPhone();
		mp.brand="ƻ��"; 				   //�������ˣ��޸�Ʒ������
		String detail=mp.buy("��������");//�������ˣ����ô������Ĺ��췽��
		System.out.println(detail);
	}

}
