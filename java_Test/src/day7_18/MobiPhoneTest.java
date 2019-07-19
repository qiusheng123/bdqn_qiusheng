package day7_18;

public class MobiPhoneTest {
/*
 * 初始化对象，给brand赋值，所以要调用有参数的构造方法，输出“发工资啦,快买一个苹果牌子的手机吧！”
 */
	public static void main(String[] args) {
		MobiPhone mp=new MobiPhone();
		mp.brand="苹果"; 				   //发工资了，修改品牌属性
		String detail=mp.buy("发工资啦");//发工资了，调用带参数的构造方法
		System.out.println(detail);
	}

}
