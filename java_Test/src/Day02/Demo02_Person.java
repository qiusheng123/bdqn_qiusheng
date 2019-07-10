package Day02;
/*
 * 方法的重载
 * 在同一个类可以定义多个同名的方法，但每个方法具有不同的参数类型或者个数。
 * 方法的签名：方法名+参数列表。
 * 
 * 方法重载的特点：
 * 。在同一个类中
 * 。方法名相同
 * 。参数的个数和类型不同
 * 。方法的返回值不能作为判断烦方法之间是否构成重载的依据
 * 。方法的修饰符（public private....）不能作为判断方法之间构成重载的依据
 */
public class Demo02_Person {
	String name;
	String age;
	String gender;
	
	public void work() {
		System.out.println(name+"的工作理念，干活挣钱吃饭");
	}
	
	private void work(String contect) {
		System.out.println(name+"的工作理念："+contect);
	}
	
	private void work(String contect,int workAge) {
		System.out.println(name+"的工作理念："+contect+"工龄："+workAge);
	}
}
