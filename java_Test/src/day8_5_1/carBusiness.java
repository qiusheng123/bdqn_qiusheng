package day8_5_1;

public class carBusiness {
	Car[]cars= {new Bus("金杯",800,"京6566754",16),
				new Bus("金龙",800,"京8696997",16),
				new Bus("金杯",1500,"京9696996",34),
				new Bus("金龙",1500,"京8696998",34),
				new Carriage("宝马",800,"京NY28588","X6"),
				new Carriage("宝马",600,"京CNY3284","550i"),
				new Carriage("别克",300,"京NT37465","林荫大道"),
				new Carriage("别克",600,"京NT96968","GL8")};
	
	public Car carChoose(String brand,String type,int seatCount) {
		Car moto=null;
		//遍历汽车数组,根据用户输入的品种、型号、座位数、返回具有那辆的车
		for (Car mymoto:cars) {
			//通过instanceof区分数组元素是轿车还是客车
			if (mymoto instanceof Car) {
				Car car=(Car)mymoto;
				if (car.getBrand().equals(brand)&&((Carriage) car).getType().equals(type)) {
					moto=car;
					break;
				}
			}else {
				Bus bus=(Bus)mymoto;
				if (bus.getBrand().equals(brand)&&bus.getSeatNum()==seatCount) {
					moto=bus;
					break;
				}
			}
		}
		return moto;
	}
		
	}
