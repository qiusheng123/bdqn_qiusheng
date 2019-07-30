package rect;

public class Rect {
	int width;//矩形宽
	int height;//矩形高
	
	public Rect() {
		this.width=10;
		this.height=10;
	}
	
	public Rect(int width,int height) {
		this.width=width;
		this.height=height;
	}
	
	//矩形面积
	public void area(int width,int height ) {
		System.out.println("矩形的面积："+width*height);  
	}
	
	//矩形周长
	public void perimeter(int width,int height ) {
		System.out.println("矩形的周长："+(width+height)*2);
	}
}
