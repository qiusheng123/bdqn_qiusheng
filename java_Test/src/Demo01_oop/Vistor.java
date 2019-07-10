package Demo01_oop;

public class Vistor {
	String name;//游客姓名
	int age;//游客年级
	
	//根据游客年龄计算门票费用
	public void showPrice() {
		if(age<=10) {
			System.out.println("门票免费");
		}else if (age<=60) {
			System.out.println("门票全票："+20+"元");
		}else {
			System.out.println("门票半价："+10+"元");
		}
	}
}
