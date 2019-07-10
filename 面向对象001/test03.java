package Day02;

import java.util.Scanner;

/*
 * 在坐标中（0<=X<=9，0<=Y<=19）有一个小格子。
在默认情况下，它出现再（0,0）位置。
当然也可以自己定义出现再坐标中的某个位置。如出现在(5,5)位置。
小格子具有的功能：
1、能够向左移动一单位
2、向右移动一单位
3、向下移动一格单位，或者自定义向下移动几个单位。
4、能显示格子自己当前的坐标。

坐标墙纸具有的功能：
1、能自定义生成坐标纸（如，我们可以指定坐标纸0<x<20,0<y50）
2、在没有格子打印在坐标墙纸时，每个坐标用 “-” 表示。
3、当坐标墙纸上打印格子时，格子用 ”#” 表示，其余用“-” 表示。
 */
public class test03 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		WallPaper wallPaper=new WallPaper();
		GeZi gezi=new GeZi();
		System.out.print("请输入x的值：");//输入格子x轴坐标
		gezi.x=input.nextInt();
		System.out.print("请输入y的值：");//输入格子y轴坐标
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
	int x;//x轴坐标
	int y;//y轴坐标
	
	public void leftMove(int x) {//向左移动一个单位
		x++;
	}
	public void rightMove(int x) {//向右移动一个单位
		x--;
	}
	public void downMove(int num) {//向下移动N个单位
		y+=num;
	}
	public void showLocalPos() {//显示格子坐标
		System.out.println("格子的坐标："+"("+x+","+y+")");
	}
}

class WallPaper{
	int x1;//墙纸宽度
	int y1;//墙纸长度
	
	public void zuoBiao(int a,int b) {//自定大小
		x1=a;
		y1=b;		
	}
	public void show(GeZi gezi) {
		for (int i = 1; i <y1; i++) {
			for (int j = 1; j < x1; j++) {
				if(gezi.x==j&&gezi.y==i) {//打印格子
					System.out.print("#");
				}else {//打印墙纸
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
}