package day01;
/*
 * ��һ���ַ��� qwertyy123df    dsgfag����������ж�����ַ����а���123��
 */
public class Test01 {

	public static void main(String[] args) {
		String str="qwertyy123df";
		
		int a=str.indexOf("1");
		int b=str.indexOf("2");
		int c=str.indexOf("3");
		if (a!=-1&&b!=-1&&c!=-1) {
			System.out.println("���ַ�������123");
		}else {
			System.out.println("���ַ���������123");
		}
		
	}

}
