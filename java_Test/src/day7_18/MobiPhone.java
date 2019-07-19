package day7_18;

public class MobiPhone {
	public String brand;
	public MobiPhone() {
		this.brand="洛基亚";
	}
	public MobiPhone(String bra) {
		this.brand=bra;
	}
	public String buy() {
		return "没发工资，买一个"+brand+"牌子的手机吧！";
	}
	public String buy(String reason) {
		return reason+",快买一个"+brand+"牌子的手机吧！";
	}
}
