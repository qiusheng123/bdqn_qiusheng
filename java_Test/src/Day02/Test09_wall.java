package Day02;
/*
 * /*
 * 9、在格子游戏的基础上，添加”口”,”L”,”T”字图像(每个图形都是4个格子组成)。
图像具有功能：
1、向左移一个单位。
2、向右移 一个单位。
3、向下移一个单位
4、向下移n个单位。

 */
class image_0{
	int x;
	int y;
}
public class Test09_wall {
	//墙纸的坐标，定位墙纸的位置
	int x;
	int y;
	
	//墙纸的长宽
	int length;
	int hight;
	
	//打印口图案
	public void printWall_0(image_0 image) {
		for (int p = 0; p < y; p++) {
			System.out.println();
		}
		for (int i = y; i <=hight+y ; i++) {//行
			for (int j = 0; j < x; j++) {
				System.out.print(" ");
			}
			for (int j = x; j <=length+x ; j++) {//列
				//打印格子
				 if (image.x==j&&image.y==i||image.x+1==j&&image.y==i
						 ||image.x==j&&image.y+1==i||image.x+1==j&&image.y+1==i) {
					System.out.print("#");
				}else {//打印“-”
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	
	//打印L型图案
	public void printWall_L(image_0 image) {
		for (int p = 0; p < y; p++) {
			System.out.println();
		}
		for (int i = y; i <=hight+y ; i++) {//行
			for (int j = 0; j < x; j++) {
				System.out.print(" ");
			}
			for (int j = x; j <=length+x ; j++) {//列
				//打印格子
				 if (image.x==j&&image.y==i||image.x==j&&image.y+1==i
						 ||image.x==j&&image.y+2==i||image.x+1==j&&image.y+2==i) {
					System.out.print("#");
				}else {//打印“-”
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	//打印丁型图案
	public void printWall_T(image_0 image) {
		for (int p = 0; p < y; p++) {
			System.out.println();
		}
		for (int i = y; i <=hight+y ; i++) {//行
			for (int j = 0; j < x; j++) {
				System.out.print(" ");
			}
			for (int j = x; j <=length+x ; j++) {//列
				//打印格子
				 if (image.x==j&&image.y==i||image.x+1==j&&image.y==i
						 ||image.x+2==j&&image.y==i||image.x+1==j&&image.y+1==i) {
					System.out.print("#");
				}else {//打印“-”
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
