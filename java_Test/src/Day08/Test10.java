package Day08;
/*
 * 10、猴子有一些桃子，每天吃一半多一个，吃了10天，还剩下一个。 使用递归解决
 */
public class Test10 {
	
	public  int eatPeach(int time, int peach) {
		if (time==1) {
			return peach;
		}else {
			time--;
			peach=(peach+1)*2;
			return eatPeach(time, peach);
		}
	}
	
	public static void main(String[] args) {
		Test10 eat=new Test10();
		int count=eat.eatPeach(10,1);
		System.out.println("第一天猴子摘了"+count+"个桃子");
	}
	
}
