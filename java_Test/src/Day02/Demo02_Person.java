package Day02;
/*
 * ����������
 * ��ͬһ������Զ�����ͬ���ķ�������ÿ���������в�ͬ�Ĳ������ͻ��߸�����
 * ������ǩ����������+�����б�
 * 
 * �������ص��ص㣺
 * ����ͬһ������
 * ����������ͬ
 * �������ĸ��������Ͳ�ͬ
 * �������ķ���ֵ������Ϊ�жϷ�����֮���Ƿ񹹳����ص�����
 * �����������η���public private....��������Ϊ�жϷ���֮�乹�����ص�����
 */
public class Demo02_Person {
	String name;
	String age;
	String gender;
	
	public void work() {
		System.out.println(name+"�Ĺ�������ɻ���Ǯ�Է�");
	}
	
	private void work(String contect) {
		System.out.println(name+"�Ĺ������"+contect);
	}
	
	private void work(String contect,int workAge) {
		System.out.println(name+"�Ĺ������"+contect+"���䣺"+workAge);
	}
}
