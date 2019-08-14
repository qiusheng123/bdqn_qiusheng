package day8_5_1;

import java.util.Scanner;

public class RentMgrSys {

	public static void main(String[] args) {
		carBusiness carBus=new carBusiness();
		
		Scanner input=new Scanner(System.in);
		  System.out.println("***********欢迎光临腾飞汽车租赁公司*************");
		  System.out.println("1、轿车  \t  2、客车");
		  System.out.print("请输入您要租赁的汽车类型:");
		  int motoType=input.nextInt();
		  //预先定义好，汽车业务类的motoLeaseOut的三个参数
		  String brand="";
		  String type="";
		  int seat=0;
		  
		  if(motoType==1) {//用户选择轿车
			  System.out.print("请选择您要租赁的汽车品牌:1、别克  2、宝马");
			  int choose2=input.nextInt();
			  if(choose2==1) {
				  brand="别克";
				  System.out.print("请选择您要租赁的汽车型号:1、林荫大道  2、GL8");
				  type=(input.nextInt() ==1)? "林荫大道":"GL8";
			  }else if(choose2==2){
				  brand="宝马";
				  System.out.println("请选择您要租赁的汽车型号:1、X6 2、550i");
				  type=(input.nextInt() ==1)? "X6":"550i";
			  }
		  }else if(motoType==2){//用户选择客车
			    type="";
				System.out.print("请选择你要租赁的汽车品牌：1、金龙 2、金杯");	
				brand=(input.nextInt()==1)?"金龙":"金杯";
				System.out.print("请选择你要租赁的汽车座位数：1、16座 2、34座");
				seat=(input.nextInt()==1)?16:34;  
		  }
			Car moto = carBus.carChoose(brand,type,seat);//获得 
			System.out.print("请输入您要租赁的天数：");
			int days=input.nextInt();
			double money=moto.discount(days);//租赁费用
			System.out.println("分配给您的汽车牌号是："+moto.getCarNo());
			System.out.println("您需要支付的租赁费用是："+money+"元。");
		  
	}	

}
