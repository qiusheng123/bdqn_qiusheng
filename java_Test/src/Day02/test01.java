package Day02;

import java.util.Scanner;

/*
 * 1、键盘录入学员姓名与学分。
       录入完毕后，管理系统能自动修改学员成绩，
       少于60的提高2分。也能输出所以的学员成绩
 */
class student{
	String name;//学生姓名
	int score;//学生成绩
}

public class test01 {
	public void modifyScore(student students[]) {
		Scanner input=new Scanner(System.in);		
		for (int i = 0; i < students.length; i++) {			
			System.out.print("请输入学生姓名：");//输入学生姓名
			students[i].name=input.next();
			System.out.print("请输入学生成绩：");//输入学生成绩
			students[i].score=input.nextInt();			
			if(students[i].score<60) {//判断成绩是否大于60，
				students[i].score+=2;
			}
		}
	}
	public void addStuden(student students[]) {//遍历students数组元素
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
