package Demo01_oop;

import java.util.Arrays;
import java.util.Scanner;


public class Test_05 {
	public static void main(String[] args) {
		use();
	}
	public static void use() {
		String []user= {"admin1","111111"};
		Scanner input=new Scanner(System.in);
		
		String[]user1=new String[2];
		System.out.println("����������û�����");
		user1[0]=input.next();
		System.out.println("�������������룺");
		user1[1]=input.next();
		boolean a=Arrays.equals(user, user1);
	
		if (a) {
			System.out.println("�����������룺");
			user[1]=input.next();
			System.out.println("�޸ĳɹ�������������Ϊ��"+user[1]);
		}else {
			System.out.println("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���ϵͳ��");
		}
		
	}
}
