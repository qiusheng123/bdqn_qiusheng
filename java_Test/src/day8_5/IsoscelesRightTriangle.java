package day8_5;
/*
 * 等腰直角三角形
 */
public class IsoscelesRightTriangle extends Figure {

	double a=GIRTH/(2+Math.sqrt(2));//计算边长
	
	public double arer() {//计算面积
		S=0.5*a*a;
		return S;
	}

}
