package Day02;
/*
 * /*
 * 9���ڸ�����Ϸ�Ļ����ϣ���ӡ��ڡ�,��L��,��T����ͼ��(ÿ��ͼ�ζ���4���������)��
ͼ����й��ܣ�
1��������һ����λ��
2�������� һ����λ��
3��������һ����λ
4��������n����λ��

 */
class image_0{
	int x;
	int y;
}
public class Test09_wall {
	//ǽֽ�����꣬��λǽֽ��λ��
	int x;
	int y;
	
	//ǽֽ�ĳ���
	int length;
	int hight;
	
	//��ӡ��ͼ��
	public void printWall_0(image_0 image) {
		for (int p = 0; p < y; p++) {
			System.out.println();
		}
		for (int i = y; i <=hight+y ; i++) {//��
			for (int j = 0; j < x; j++) {
				System.out.print(" ");
			}
			for (int j = x; j <=length+x ; j++) {//��
				//��ӡ����
				 if (image.x==j&&image.y==i||image.x+1==j&&image.y==i
						 ||image.x==j&&image.y+1==i||image.x+1==j&&image.y+1==i) {
					System.out.print("#");
				}else {//��ӡ��-��
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	
	//��ӡL��ͼ��
	public void printWall_L(image_0 image) {
		for (int p = 0; p < y; p++) {
			System.out.println();
		}
		for (int i = y; i <=hight+y ; i++) {//��
			for (int j = 0; j < x; j++) {
				System.out.print(" ");
			}
			for (int j = x; j <=length+x ; j++) {//��
				//��ӡ����
				 if (image.x==j&&image.y==i||image.x==j&&image.y+1==i
						 ||image.x==j&&image.y+2==i||image.x+1==j&&image.y+2==i) {
					System.out.print("#");
				}else {//��ӡ��-��
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	//��ӡ����ͼ��
	public void printWall_T(image_0 image) {
		for (int p = 0; p < y; p++) {
			System.out.println();
		}
		for (int i = y; i <=hight+y ; i++) {//��
			for (int j = 0; j < x; j++) {
				System.out.print(" ");
			}
			for (int j = x; j <=length+x ; j++) {//��
				//��ӡ����
				 if (image.x==j&&image.y==i||image.x+1==j&&image.y==i
						 ||image.x+2==j&&image.y==i||image.x+1==j&&image.y+1==i) {
					System.out.print("#");
				}else {//��ӡ��-��
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		image_0 image=new image_0();
		image.x=5;
		image.y=5;
		Test09_wall wall=new Test09_wall();
		wall.x=0;
		wall.y=0;
		wall.length=20;
		wall.hight=20;
		wall.printWall_0(image);
		wall.printWall_L(image);
		wall.printWall_T(image);
	}
}
