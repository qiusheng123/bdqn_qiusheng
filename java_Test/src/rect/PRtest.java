package rect;

public class PRtest {

	public static void main(String[] args) {
		PlainRect pr=new PlainRect(10,20,10,10);
		pr.area(10, 20);
		pr.perimeter(10, 20);
		
		if (pr.isINside(25.5, 13)) {
			System.out.println("(25.5,13)�ھ�����");
		}else {
			System.out.println("(25.5,13)���ھ�����");
		}
	}

}
