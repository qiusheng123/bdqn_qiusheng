package Demo01_oop;

import java.util.Scanner;

public class Test_06 {
	public static void main(String[] args) {
		//����һ���û�
	Administrator user=new Administrator();
	user.name="admin";
	user.password="111111";
	
	//�����û�����
	Scanner input=new Scanner(System.in);
	System.out.println("�������û�����");
	String userName=input.next();
	System.out.println("���������룺");
	String passWord=input.next();
	
	if (user.name.equals(userName)&&(user.password).equals(passWord)) {
		//��������
		System.out.println("�����������룺");
		user.password=input.next();	
		System.out.println("�޸�����ɹ���������Ϊ��"+user.password);
	  }
	else {
		System.out.println("��������û������������޷���ȡ��������Ȩ�ޣ�");
	}
	}
}
