package day01;
/*
 * 10���ж�.java�ļ����Ƿ���ȷ
 */
public class Test09 {
	public static void main(String[] args) {
		String name="hello.java";
		
		//��ȡ�ļ��������һ��.���ֵ�λ��
		int index=name.lastIndexOf(".");
		
		//��ȡ�ļ��ĺ�׺
		String str1=name.substring(name.lastIndexOf(".")+1);
		
		//�жϱ��������.���ţ��Ҳ��ܳ�����λ��ͬʱ��׺��Ϊjava
		if (index!=-1&&index>0&&"java".equals(str1)) {
			System.out.println("�ļ�����ȷ");
		}else {
			System.out.println("�ļ�������ȷ");
		}
	}
}
