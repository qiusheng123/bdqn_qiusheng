package com.baidu.research;

public class Student {
	String name;
	String sex;
	int age;
	public void stu() {
		System.out.println("������"+name+" �Ա�"+sex+" ���䣺"+age);
	}
	//1.ʹ��this���ó�Ա����
	public Student(String name,String sex) {
		this.name=name;
		this.sex=sex;
	}
	//2.this���ó�Ա����
	public void play() {
		this.age=age;
		this.stu();
	}
	//3.ʹ��this�������صĹ��췽��
	public Student(String name,String sex,int age) {
		this (name,sex);
		this.age=age;
		
	}
}
