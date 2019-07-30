package rect;

public class PlainRect extends Rect {
	int startX;//�������Ͻ�����x��
	int startY;//�������Ͻ�����y��
	
	public PlainRect(int startX,int startY,int width,int height) {
		this.height=height;
		this.width=width;
		this.startX=startX;
		this.startY=startY;
	}
	
	public PlainRect() {
		this.startX=0;
		this.startY=0;
	}
	
	//�ж�����������Ƿ��ھ����ڲ�
	public boolean isINside(double x,double y) {
		
		if ( x>=startX&&x<=(startX+width)&&y<startY&&y>=(startY-height)) {
			return true;
			
		}else {
			return false;
		}	
	}
}
