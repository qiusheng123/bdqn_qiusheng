package Day08;
/*
 * 10��������һЩ���ӣ�ÿ���һ���һ��������10�죬��ʣ��һ���� ʹ�õݹ���
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
		System.out.println("��һ�����ժ��"+count+"������");
	}
	
}
