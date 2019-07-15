package Day08;

public class Test11_Wall {
	//通过坐标，定位墙纸的位置
		int x;
		int y;
		
		//墙纸的长宽
		int length;
		int hight;
		
		public Test11_Wall(int x1,int y1,int length1,int hight1) {
			x=x1;
			y=y1;
			length=length1;
			hight=hight1;
		}
		
		public void printWall(Test11_T T) {
			//获取格子数组
			Test11_cell[] cells =T.cells;
			
			//定位墙纸纵坐标的位置
			for(int p=0;p<y;p++) {
				System.out.println();
			}
			
			//打印墙纸的同时定位横坐标
			for(int i=0;i<y+hight;i++) {//行

				for(int j=0;j<x+length;j++) {//列
					//定位墙纸横坐标的位置
					if(j<x) {
						System.out.print(" ");
					}else if(
							(cells[0].x==j && cells[0].y==i) || 
							(cells[1].x==j && cells[1].y==i) || 
							(cells[2].x==j && cells[2].y==i) ||  
							(cells[3].x==j && cells[3].y==i)
							) {//打印格子
						System.out.print("#");
					}else {//打印"-"
						System.out.print("-");
					}
				}
					System.out.println();
		
			}
			
		}
		
		public static void main(String[] args) {
			Test11_Wall wall=new Test11_Wall(0,0,20,20);
			//T型
			Test11_T T = new Test11_T(3,3);			
			T.right();
			wall.printWall(T);
			
		}
}
