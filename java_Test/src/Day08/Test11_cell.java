package Day08;

public class Test11_cell {
	int x;//格子横坐标
	int y;//格子纵坐标
	
	public Test11_cell(int x1,int y1) {
		x=x1;
		y=y1;
	}
	
	//左移动一单位
	public void leftMove() {
		x--;
	}
	
	//右移动一个单位
	public void rightMove() {
		x++;
	}
	
	//向下移动一个单位
	public void drop() {
		y++;
	}
	
	//向下移动n个单位
	public void drop(int n) {
		y+=n;
	}
	
	//能显示格子自己当前的坐标
	public void showInfo() {
		System.out.println("格子当前坐标：("+x+","+y+")  ");
	}
}
