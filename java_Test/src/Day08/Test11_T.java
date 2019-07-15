package Day08;
/*
 * 在格子游戏的基础上，添加”L”,”T”字图像(每个图形都是4个格子组成)。
 */
public class Test11_T {
	 //以左上角第一个格子坐标为参考系
	 int x;
	 int y;
	 
	 Test11_cell[] cells;//cells数组存多个格子，最终形成图像"田"
	 
	 public Test11_T(int x,int y) {//初始化为"田字型"
		 cells=new Test11_cell[] {
				new  Test11_cell(x, y),
				new  Test11_cell(x+1,y),
				new  Test11_cell(x+2,y),
				new  Test11_cell(x+1,y+1)
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
