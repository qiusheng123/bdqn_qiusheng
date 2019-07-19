package com.baidu.research;

public class user_test {
		public static void main(String[] args) {
			com.baidu.marketingdepartment.user LM=new com.baidu.marketingdepartment.user();
			LM.setName("刘明");
			
			LM.setPassword("lanxinshi250");
			
			LM.setAddress("天上人间");
			
			System.out.println("姓名："+LM.getName()+"\n用户密码："+LM.getPassword()
								+"\n用户地址："+LM.getAddress());
		}
		/*
		 * new的对象存放在堆中，LM.调用方法时在栈中分配一个栈桢存储所有局部变量和参数，
		 * 方法结束时，栈桢消失。
		 * 
		 */
	
	}


