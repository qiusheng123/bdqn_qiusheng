package Day02;

import java.util.Scanner;

/*
 * 1������¼��ѧԱ������ѧ�֡�
       ¼����Ϻ󣬹���ϵͳ���Զ��޸�ѧԱ�ɼ���
       ����60�����2�֡�Ҳ��������Ե�ѧԱ�ɼ�
 */
class student{
	String name;//ѧ������
	int score;//ѧ���ɼ�
}

public class test01 {
	public void modifyScore(student students[]) {
		Scanner input=new Scanner(System.in);		
		for (int i = 0; i < students.length; i++) {			
			System.out.print("������ѧ��������");//����ѧ������
			students[i].name=input.next();
			System.out.print("������ѧ���ɼ���");//����ѧ���ɼ�
			students[i].score=input.nextInt();			
			if(students[i].score<60) {//�жϳɼ��Ƿ����60��
				students[i].score+=2;
			}
		}
	}
	public void addStuden(student students[]) {//����students����Ԫ��
		for (int i = 0; i < students.length; i++) {
			
			System.out.println(students[i].name+" "+students[i].score);
		}
	}
	
	
	public static void main(String[] args) {
		test01 test=new test01();
		student[] students=new student[3];
		for (int j = 0; j < students.length; j++) {
			students[j]=new student();
		}	
		test.modifyScore( students);
		test.addStuden(students);
		
	}
}
