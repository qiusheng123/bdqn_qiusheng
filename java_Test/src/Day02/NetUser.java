package Day02;
/*
 * ������һ�������û��� ��Ա������ �û�ID���û����롢email��ַ���ж����Ĺ��췽��
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
