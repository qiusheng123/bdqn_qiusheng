package Day02;

import java.util.Scanner;

/*
 * �������У�0<=X<=9��0<=Y<=19����һ��С���ӡ�
��Ĭ������£��������٣�0,0��λ�á�
��ȻҲ�����Լ���������������е�ĳ��λ�á��������(5,5)λ�á�
С���Ӿ��еĹ��ܣ�
1���ܹ������ƶ�һ��λ
2�������ƶ�һ��λ
3�������ƶ�һ��λ�������Զ��������ƶ�������λ��
4������ʾ�����Լ���ǰ�����ꡣ

����ǽֽ���еĹ��ܣ�
1�����Զ�����������ֽ���磬���ǿ���ָ������ֽ0<x<20,0<y50��
2����û�и��Ӵ�ӡ������ǽֽʱ��ÿ�������� ��-�� ��ʾ��
3��������ǽֽ�ϴ�ӡ����ʱ�������� ��#�� ��ʾ�������á�-�� ��ʾ��
 */
public class test03 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		WallPaper wallPaper=new WallPaper();
		GeZi gezi=new GeZi();
		System.out.print("������x��ֵ��");//�������x������
		gezi.x=input.nextInt();
		System.out.print("������y��ֵ��");//�������y������
		gezi.y=input.nextInt();
		gezi.showLocalPos();
		if ((gezi.x>=0&&gezi.x<=9)&&(gezi.y>=0&&gezi.y<=19)) {
			wallPaper.zuoBiao(9, 19);
			wallPaper.show(gezi);
			System.out.println();
			gezi.downMove(-2);
			wallPaper.show(gezi);
			
		}
	}
	
}
class GeZi{
	int x;//x������
	int y;//y������
	
	public void leftMove(int x) {//�����ƶ�һ����λ
		x++;
	}
	public void rightMove(int x) {//�����ƶ�һ����λ
		x--;
	}
	public void downMove(int num) {//�����ƶ�N����λ
		y+=num;
	}
	public void showLocalPos() {//��ʾ��������
		System.out.println("���ӵ����꣺"+"("+x+","+y+")");
	}
}

class WallPaper{
	int x1;//ǽֽ���
	int y1;//ǽֽ����
	
	public void zuoBiao(int a,int b) {//�Զ���С
		x1=a;
		y1=b;		
	}
	public void show(GeZi gezi) {
		for (int i = 1; i <y1; i++) {
			for (int j = 1; j < x1; j++) {
				if(gezi.x==j&&gezi.y==i) {//��ӡ����
					System.out.print("#");
				}else {//��ӡǽֽ
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
}