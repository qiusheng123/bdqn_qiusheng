package Day08;
/*
 * ��ǽֽ���ܴ�ӡͼ���磺
- - - - - - - - - - - - - - - - - - 
- - - - # # - - - - - - - - - - -
- - - - # # - - - - - - - - - - -
- - - - - - - - - - - - - - - - - -
 */
public class Test09_Wall {
	//ͨ�����꣬��λǽֽ��λ��
	int x;
	int y;
	
	//ǽֽ�ĳ���
	int length;
	int hight;
	
	public Test09_Wall(int x1,int y1,int length1,int hight1) {
		x=x1;
		y=y1;
		length=length1;
		hight=hight1;
	}
	
	public void printWall(Test09_O O) {
		//��ȡ��������
		Test09_Cell[] cells = O.cells;
		
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
		Test09_Wall wall=new Test09_Wall(0,0,20,20);
		Test09_O O = new Test09_O(2,2);

		O.left();

		wall.printWall(O);
	}

}
