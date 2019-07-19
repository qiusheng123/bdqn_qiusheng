package Day08;
/*
 * �ڸ�����Ϸ�Ļ����ϣ���ӡ��ڡ�,��L��,��T����ͼ��(ÿ��ͼ�ζ���4���������)��
ͼ����й��ܣ�
1��������һ����λ��
2�������� һ����λ��
3��������һ����λ
4��������n����λ��
 */
public class Test09_O {
	 //�����Ͻǵ�һ����������Ϊ�ο�ϵ
	 int x;
	 int y;
	 
	 Test09_Cell[] cells;//cells����������ӣ������γ�ͼ��"��"
	 
	 public Test09_O(int x,int y) {//��ʼ��Ϊ"������"
		 cells=new Test09_Cell[] {
				new  Test09_Cell(x, y),
				new  Test09_Cell(x+1,y),
				new  Test09_Cell(x,y+1),
				new  Test09_Cell(x+1,y+1)
		 };	
	 }
	 
	 //������һ����λ
	 public void left() {
		 for(Test09_Cell cell:cells){
			 cell.x--;
		 }
		
	 }
	 //������һ����λ
	 public void right() {
		 for(Test09_Cell cell:cells){
			 cell.x++;
		 }
	 }
	 
	 //����
	 public void drop() {
		 for(Test09_Cell cell:cells){
			 cell.y++;
		 }
	 }
	 //����n����λ
	 public void drop(int n) {
		
		 for(Test09_Cell cell:cells){
			 cell.y+=n;
		 }
	 }
	 
	 //��ʾ"��"��ͼ�������
	 public void showImg() {
		 for(Test09_Cell cell:cells) {
			 cell.showInfo();
		 }
	 }
}
