package day8_5_1;
/*
 * ����
 */
public abstract class Car {
	private	String brand;//Ʒ��
	private	double rent;//���
	private	String carNo;//����
	public Car() {
		
	}
	
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getRent() {
		return rent;
	}


	public void setRent(double rent) {
		this.rent = rent;
	}


	public String getCarNo() {
		return carNo;
	}


	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}


	public Car(String brand, double rent, String carNo) {
		super();
		this.brand = brand;
		this.rent = rent;
		this.carNo = carNo;
	}


	public abstract double discount(int days);//����
	
}
