package day8_5;
/*
 * ����ֱ��������
 */
public class IsoscelesRightTriangle extends Figure {

	double a=GIRTH/(2+Math.sqrt(2));//����߳�
	
	public double arer() {//�������
		S=0.5*a*a;
		return S;
	}

}
