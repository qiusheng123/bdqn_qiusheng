package day7_18;

public class MobiPhone {
	public String brand;
	public MobiPhone() {
		this.brand="�����";
	}
	public MobiPhone(String bra) {
		this.brand=bra;
	}
	public String buy() {
		return "û�����ʣ���һ��"+brand+"���ӵ��ֻ��ɣ�";
	}
	public String buy(String reason) {
		return reason+",����һ��"+brand+"���ӵ��ֻ��ɣ�";
	}
}
