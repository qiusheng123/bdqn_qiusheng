package rect;

public class Rect {
	int width;//���ο�
	int height;//���θ�
	
	public Rect() {
		this.width=10;
		this.height=10;
	}
	
	public Rect(int width,int height) {
		this.width=width;
		this.height=height;
	}
	
	//�������
	public void area(int width,int height ) {
		System.out.println("���ε������"+width*height);  
	}
	
	//�����ܳ�
	public void perimeter(int width,int height ) {
		System.out.println("���ε��ܳ���"+(width+height)*2);
	}
}
