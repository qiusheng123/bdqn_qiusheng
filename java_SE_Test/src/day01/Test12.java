package day01;
/*
 * 12����һ���ַ�����0����ѭ��ʮ�Ρ�(ʹ��stringBuilder�������δ�������)
 */
public class Test12 {
	public static void main(String[] args) {
		String str="0";
		StringBuilder sb=new StringBuilder(str);
		for (int i = 1; i <=10; i++) {
			sb.append(i);
			String str1=sb.toString();
			System.out.println("��"+i+"�Σ�"+str1);
		}
		
	}
}
