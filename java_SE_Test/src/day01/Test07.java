package day01;

import java.util.Scanner;

/* 
 * 8���Զ���һ���ַ������û�����¼��һ���ַ����жϸ��ַ��Ƿ����Զ�����ַ����У�ʹ��toCharArray������
 */
public class Test07 {
	public static void main(String[] args) {
		String str="ӰŪ��֦��ŪӰ��˿ǣ������ǣ˿��";
		char[]st=str.toCharArray();
		
		Scanner input=new Scanner(System.in);
		System.out.print("������һ���ַ���");
		
		String str1=input.next();
		boolean flag=false;
		for (int i = 0; i < st.length; i++) {
			if (st[i]==str.charAt(0)) {
				flag=true;
				break;
			}
		}
		if (flag) {
			System.out.println("�ַ�"+str.charAt(0)+"���Զ����ַ�����");
		}else {
			System.out.println("�ַ�"+str.charAt(0)+"�����Զ����ַ�����");
		}
		
	}
}
