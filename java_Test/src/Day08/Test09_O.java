package Day08;
/*
 * 在格子游戏的基础上，添加”口”,”L”,”T”字图像(每个图形都是4个格子组成)。
图像具有功能：
1、向左移一个单位。
2、向右移 一个单位。
3、向下移一个单位
4、向下移n个单位。
 */
public class Test09_O {
	 //以左上角第一个格子坐标为参考系
	 int x;
	 int y;
	 
	 Test09_Cell[] cells;//cells数组存多个格子，最终形成图像"田"
	 
	 public Test09_O(int x,int y) {//初始化为"田字型"
		 cells=new Test09_Cell[] {
				new  Test09_Cell(x, y),
				new  Test09_Cell(x+1,y),
				new  Test09_Cell(x,y+1),
				new  Test09_Cell(x+1,y+1)
		 };	
	 }
	 
	 //向左移一个单位
	 public void left() {
		 for(Test09_Cell cell:cells){
			 cell.x--;
		 }
		
	 }
	 //向右移一个单位
	 public void right() {
		 for(Test09_Cell cell:cells){
			 cell.x++;
		 }
	 }
	 
	 //向下
	 public void drop() {
		 for(Test09_Cell cell:cells){
			 cell.y++;
		 }
	 }
	 //向下n个单位
	 public void drop(int n) {
		
		 for(Test09_Cell cell:cells){
			 cell.y+=n;
		 }
	 }
	 
	 //显示"田"子图像的坐标
	 public void showImg() {
		 for(Test09_Cell cell:cells) {
			 cell.showInfo();
		 }
	 }
}
