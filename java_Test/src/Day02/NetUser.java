package Day02;
/*
 * 、定义一个网络用户类 成员变量有 用户ID、用户密码、email地址。有多样的构造方法
 */
public class NetUser {
	String id;
	String password;
	String email;
	public NetUser(String id,String password,String email) {
		this.id=id;
		this.password=password;
		this.email=email;	
	}
	public NetUser(){
		System.out.println(id+password+email);
	}
}
