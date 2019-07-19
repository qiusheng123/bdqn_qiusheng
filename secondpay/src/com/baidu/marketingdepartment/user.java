package com.baidu.marketingdepartment;

public class user {
	private String name;//ÓÃ»§ĞÕÃû
	private String password;//ÃÜÂë
	private String address;//µØÖ·
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		
		return password;
	}
	public void setPassword(String password) {
		if (password.length()==6) {
			this.password = password;	
		}else {
			System.out.println("ÃÜÂë´íÎó£¡");
		}
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
