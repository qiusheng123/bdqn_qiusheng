package day01;
/*
 * 7������StringBuilder�ķ�ת�������жϸ������ַ����Ƿ�Ϊ����(�ַ����Զ���)
 */
public class Test06 {
	public static void main(String[] args) {
		String str="�ڹ��λ��ι���";
		StringBuilder sb=new StringBuilder(str);
		StringBuilder st=sb.reverse();
		
		String str1=str.toString();
		if (str1.equals(str)) {
			System.out.println("���ַ����ǻ���");
		}else {
			System.out.println("���ַ������ǻ���");
		}
	}
}
