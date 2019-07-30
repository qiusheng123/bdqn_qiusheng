package rect;

public class PlainRect extends Rect {
	int startX;//矩形左上角坐标x轴
	int startY;//矩形左上角坐标y轴
	
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
	
	//判断输入的坐标是否在矩形内部
	public boolean isINside(double x,double y) {
		
		if ( x>=startX&&x<=(startX+width)&&y<startY&&y>=(startY-height)) {
			return true;
			
		}else {
			return false;
		}	
	}
}
