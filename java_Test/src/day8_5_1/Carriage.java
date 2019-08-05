package day8_5_1;

public class Carriage extends Car {
	
	private String type;//ĞÍºÅ
	public Carriage() {
		
	}
	public Carriage(String brand, double rent, String carNo,String type) {
		super(brand, rent, carNo);
		this.type=type;
		
	}
	
	public double discount(int days) {
		//´òÕÛ
		double rent =this.getRent()*days;
		if (days>=150) {
			rent=rent*0.7;
		}else if (days>=30) {
			rent=rent*0.8;
		}
		else if (days>=7) {
			rent=rent*0.9;
		}else {
			return rent;
		}
		return rent;
	}

}
