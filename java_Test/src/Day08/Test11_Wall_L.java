package Day08;

public class Test11_Wall_L {
	//ͨ�����꣬��λǽֽ��λ��
			int x;
			int y;
			
			//ǽֽ�ĳ���
			int length;
			int hight;
	public Test11_Wall_L(int x1,int y1,int length1,int hight1) {
		x=x1;
		y=y1;
		length=length1;
		hight=hight1;
	}
	
	public void printWall(Test11_L L) {
		//��ȡ��������
		Test11_cell[] cells =L.cells;
		
		//��λǽֽ�������λ��
		for(int p=0;p<y;p++) {
			System.out.println();
		}
		
		//��ӡǽֽ��ͬʱ��λ������
		for(int i=0;i<y+hight;i++) {//��

			for(int j=0;j<x+length;j++) {//��
				//��λǽֽ�������λ��
				if(j<x) {
					System.out.print(" ");
				}else if(
						(cells[0].x==j && cells[0].y==i) || 
						(cells[1].x==j && cells[1].y==i) || 
						(cells[2].x==j && cells[2].y==i) ||  
						(cells[3].x==j && cells[3].y==i)
						) {//��ӡ����
					System.out.print("#");
				}else {//��ӡ"-"
					System.out.print("-");
				}
			}
				System.out.println();
	
		}
		
	}
	public static void main(String[] args) {
		Test11_Wall_L wall=new Test11_Wall_L(0,0,20,20);
		//T��
		Test11_L L = new Test11_L(3,3);			
		L.drop(2);
		wall.printWall(L);
	}
}
