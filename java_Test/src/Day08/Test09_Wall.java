package Day08;
/*
 * 在墙纸上能打印图像，如：
- - - - - - - - - - - - - - - - - - 
- - - - # # - - - - - - - - - - -
- - - - # # - - - - - - - - - - -
- - - - - - - - - - - - - - - - - -
 */
public class Test09_Wall {
	//通过坐标，定位墙纸的位置
	int x;
	int y;
	
	//墙纸的长宽
	int length;
	int hight;
	
	public Test09_Wall(int x1,int y1,int length1,int hight1) {
		x=x1;
		y=y1;
		length=length1;
		hight=hight1;
	}
	
	public void printWall(Test09_O O) {
		//获取格子数组
		Test09_Cell[] cells = O.cells;
		
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
		Test09_Wall wall=new Test09_Wall(0,0,20,20);
		Test09_O O = new Test09_O(2,2);

		O.left();

		wall.printWall(O);
	}

}
