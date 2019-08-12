package day8_5_1;

public class Bus extends Car {
	
	private int seatNum;//×ùÎ»Êı
	
	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

	public Bus() {
		
	}
	
	public Bus(String brand, double rent, String carNo,int seatNum) {
		super(brand, rent, carNo);
		this.seatNum=seatNum;
		
	}
	
	public double discount(int days) {
		double rent =this.getRent()*days;
		//´òÕÛ
		if (days>=150) {
			rent=rent*0.6;
		}else if (days>=30) {
			rent=rent*0.7;
		}
		else if (days>=7) {
			rent=rent*0.8;
		}
		else if (days>=3) {
			rent=rent*0.9;
		}else {
			return rent;
		}
		return rent;
	}

}
