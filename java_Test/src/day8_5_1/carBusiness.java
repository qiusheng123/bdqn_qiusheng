package day8_5_1;

public class carBusiness {
	Car[]cars= {new Bus("��",800,"��6566754",16),
				new Bus("����",800,"��8696997",16),
				new Bus("��",1500,"��9696996",34),
				new Bus("����",1500,"��8696998",34),
				new Carriage("����",800,"��NY28588","X6"),
				new Carriage("����",600,"��CNY3284","550i"),
				new Carriage("���",300,"��NT37465","������"),
				new Carriage("���",600,"��NT96968","GL8")};
	
	public Car carChoose(String brand,String type,int seatCount) {
		Car moto=null;
		//������������,�����û������Ʒ�֡��ͺš���λ�������ؾ��������ĳ�
		for (Car mymoto:cars) {
			//ͨ��instanceof��������Ԫ���ǽγ����ǿͳ�
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
