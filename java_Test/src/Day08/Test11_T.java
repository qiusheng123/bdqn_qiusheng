package Day08;
/*
 * �ڸ�����Ϸ�Ļ����ϣ���ӡ�L��,��T����ͼ��(ÿ��ͼ�ζ���4���������)��
 */
public class Test11_T {
	 //�����Ͻǵ�һ����������Ϊ�ο�ϵ
	 int x;
	 int y;
	 
	 Test11_cell[] cells;//cells����������ӣ������γ�ͼ��"��"
	 
	 public Test11_T(int x,int y) {//��ʼ��Ϊ"������"
		 cells=new Test11_cell[] {
				new  Test11_cell(x, y),
				new  Test11_cell(x+1,y),
				new  Test11_cell(x+2,y),
				new  Test11_cell(x+1,y+1)
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
