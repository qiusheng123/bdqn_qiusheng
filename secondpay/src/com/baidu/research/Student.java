package com.baidu.research;

public class Student {
	String name;
	String sex;
	int age;
	public void stu() {
		System.out.println("姓名："+name+" 性别："+sex+" 年龄："+age);
	}
	//1.使用this调用成员变量
	public Student(String name,String sex) {
		this.name=name;
		this.sex=sex;
	}
	//2.this调用成员方法
	public void play() {
		this.age=age;
		this.stu();
	}
	//3.使用this调用重载的构造方法
	public Student(String name,String sex,int age) {
		this (name,sex);
		this.age=age;
		
	}
}
