package Day08;
/*
 * 10��������һЩ���ӣ�ÿ���һ���һ��������10�죬��ʣ��һ���� ʹ�õݹ���
 */
public class Test10 {
	
	public  int eatPeach(int day) {
		   if (day == 10)
	        {
	            return 1;
	        }
	        else
	        {
	            return (eatPeach(day + 1) + 1) * 2;

		}
	}
	
	public static void main(String[] args) {
		Test10 eat=new Test10();
		int count=eat.eatPeach(1);
		System.out.println("��һ�����ժ��"+count+"������");
	}
	
}
