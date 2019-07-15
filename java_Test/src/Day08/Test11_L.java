package Day08;

public class Test11_L {
	 //以左上角第一个格子坐标为参考系
	 int x;
	 int y;
	 
	 Test11_cell[] cells;//cells数组存多个格子，最终形成图像"田"
	 
	 public Test11_L(int x,int y) {//初始化为"田字型"
		 cells=new Test11_cell[] {
				new  Test11_cell(x, y),
				new  Test11_cell(x,y+1),
				new  Test11_cell(x,y+2),
				new  Test11_cell(x+1,y+2)
		 };	
	 }
	 
	 //向左移一个单位
	 public void left() {
		 for(Test11_cell cell:cells){
			 cell.x--;
		 }
		
	 }
	 //向右移一个单位
	 public void right() {
		 for(Test11_cell cell:cells){
			 cell.x++;
		 }
	 }
	 
	 //向下
	 public void drop() {
		 for(Test11_cell cell:cells){
			 cell.y++;
		 }
	 }
	 //向下n个单位
	 public void drop(int n) {
		
		 for(Test11_cell cell:cells){
			 cell.y+=n;
		 }
	 }
	 
	 //显示"田"子图像的坐标
	 public void showImg() {
		 for(Test11_cell cell:cells) {
			 cell.showInfo();
		 }
	 }
}
