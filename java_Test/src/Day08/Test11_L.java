package Day08;

public class Test11_L {
	 //�����Ͻǵ�һ����������Ϊ�ο�ϵ
	 int x;
	 int y;
	 
	 Test11_cell[] cells;//cells����������ӣ������γ�ͼ��"��"
	 
	 public Test11_L(int x,int y) {//��ʼ��Ϊ"������"
		 cells=new Test11_cell[] {
				new  Test11_cell(x, y),
				new  Test11_cell(x,y+1),
				new  Test11_cell(x,y+2),
				new  Test11_cell(x+1,y+2)
		 };	
	 }
	 
	 //������һ����λ
	 public void left() {
		 for(Test11_cell cell:cells){
			 cell.x--;
		 }
		
	 }
	 //������һ����λ
	 public void right() {
		 for(Test11_cell cell:cells){
			 cell.x++;
		 }
	 }
	 
	 //����
	 public void drop() {
		 for(Test11_cell cell:cells){
			 cell.y++;
		 }
	 }
	 //����n����λ
	 public void drop(int n) {
		
		 for(Test11_cell cell:cells){
			 cell.y+=n;
		 }
	 }
	 
	 //��ʾ"��"��ͼ�������
	 public void showImg() {
		 for(Test11_cell cell:cells) {
			 cell.showInfo();
		 }
	 }
}
