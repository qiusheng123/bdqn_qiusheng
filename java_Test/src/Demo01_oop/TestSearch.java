package Demo01_oop;

import java.util.Scanner;

public class TestSearch {
	/**
	 * ���ô�3�������ķ���
	 */
	public static void main(String[] args) {
		StudentBiz st = new StudentBiz();
		Scanner input = new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.print("������ѧ��������");
			String newName = input.next();		
			st.addName(newName);
		}		
		st.showNames();				
		System.out.print("\n�����뿪ʼ���ҵ�λ�ã�");
		int s = input.nextInt();
		System.out.print("������������ҵ�λ�ã�");
		int e = input.nextInt();
		System.out.print("��������ҵ�������");
		String name = input.next();
		System.out.println("\n*****���ҽ��*****");
		if(st.searchName(s,e,name)){
			System.out.println("�ҵ��ˣ�");
		}
		else{
			System.out.println("û�ҵ���ѧ����");
		}
}
}
