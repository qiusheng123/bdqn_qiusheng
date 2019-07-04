package Day08;

import java.util.Scanner;


/*
 * 吃货联盟订餐系统
 */
public class Demo01_orderinfMgr3 {
		
	public static void main(String[] args) {
		//定义菜品数组，及数据
		String[] dishNames= {"红烧带鱼","鱼香肉丝","时令鲜蔬"}; //菜品名称
		double[] prices= {38.0,20.0,10.0};//菜品单价
		int[] praiseNums=new int[3];//点赞数，默认值为0
		
		//定义订单数组，最多4条订单
		String[]names=new String[4];//订餐人姓名
		String[]dishMegs=new String[4];//所选菜品，包括菜品名以及份数
		int[]times=new int[4];//送餐时间
		String[]addresses=new String[4];//送餐地址
		int[]states=new int[4];//订单状态：0表示已预订，1表示已完成
		double[]sumPrices=new double[4];//总金额
		
		Scanner input=new Scanner(System.in);
		int num=-1;//用户录入0返回主菜单，否则退出系统
		boolean isExit=false;//标志用户是否退出系统，true退出系统；
		//循环显示系统菜单，用户根据录入的数字执行相应的功能
		do {
			System.out.println("**********************************");
			System.out.println("1、我要订餐");
			System.out.println("2、查看订餐");
			System.out.println("3、签收订餐");
			System.out.println("4、删除订餐");
			System.out.println("5、我要点赞");
			System.out.println("6、退出系统");
			System.out.println("**********************************");
			System.out.print("请选择：");
			int choose=input.nextInt();//记录用户编号
			
			/*
			 * 根据用户输入功能编号，执行相应的功能。
			 */
			switch (choose) {
			case 1:
				 //我要订餐				
				 System.out.println("***我要订餐***");
				 boolean isAdd=false;//记录餐带是否为空
				 //显示菜品
				 for(int j=0;j<names.length;j++) {
					 if(names[j]==null) {//找到第一个空位置，可以添加订单
						 isAdd=true;//置标志位，可以订餐
						 System.out.println("序号"+"\t"+"菜名"+"\t"+"单价"+"\t"+"点赞数");
						 for(int i=0;i<dishNames.length;i++) {
							 String pri=prices[i]+"元";
							 String praiseNum=praiseNums[i]>0?(praiseNums[i]+"赞"):"0";
							 System.out.println((i+1)+"\t"+dishNames[i]+"\t"+pri+"\t"+praiseNum);
						 }
						 
						 //用户选择菜品
						 System.out.print("请输入订餐人姓名：");
						 String name=input.next();
						 System.out.print("请选择需要的菜品编码：");
						 int chooseDish=input.nextInt();
						 System.out.print("请选择您需要的份数：");
						 int number=input.nextInt();
						String dishMeg= dishNames[chooseDish-1]+""+number+"份";
						double sumPrice=prices[chooseDish-1]*number;
						
						//餐费满50元，免送餐费5元
						double deliCharge=(sumPrice>=50)?0:5;
						
						System.out.println("请输入送餐时间（送餐时间是10点到20点间整点送餐）：");
						int time=input.nextInt();
						while(time<10||time>20) {
							System.out.println("您的输入有误，请输入10~20之间的整数！");
								time=input.nextInt();
						}
						//送餐地址
						System.out.println("请输入送餐地址：");
						String address=input.next();  
						
						//无需添加状态，默认为0，即已预订状态
						System.out.println("订餐成功！");
						System.out.println("您订的是："+dishMeg);
						System.out.println("送餐时间："+time+"点");
						System.out.println("餐费："+sumPrice+"元，送餐费"+deliCharge+"元，总计："
						+(sumPrice+deliCharge)+"元");
						
						//添加数据
						names[j]=name;
						dishMegs[j]=dishMeg;
						times[j]=time;
						addresses[j]=address;
						sumPrices[j]=sumPrice;
						 break;
					}					 			 
				 }
					  if(!isAdd) {
						   System.out.println("对不起，您的餐袋已满");
					   }
				 break;
			case 2:	
				 //查看餐带
				 System.out.println("***查看餐带***");
				 System.out.println("序号\t订餐人\t餐品信息\t\t送餐时间\t送餐地址\t总金额\t订单状态");
				 for (int i = 0; i < names.length; i++) {
					if (names[i]!=null) {
						String state=(states[i]==0)?"已预订":"已完成";
						String date=times[i]+"点";
						String sumPrice=sumPrices[i]+"元";
						System.out.println((i+1)+"\t"+names[i]+"\t"+dishMegs[i]
								+"\t"+date+"\t"+addresses[i]+"\t"+sumPrices[i]+"\t"+state);
					}
				}
				 break;
			case 3:	
				 //签收订单
				 System.out.println("***签收订单***");
				 boolean isSingFind=false;//找到要签收的订单
				 System.out.println("请悬着要签收的订单序号：");
				 int singOrderId=input.nextInt();
				 for (int i = 0; i < names.length; i++) {
					//状态为预订，序号为用户输入的订单序号减1：可签收
					//状态为已完成，序号为用户输入的订单号减1，不可签收
					 if (names[i]!=null&&states[i]==0&&singOrderId==i+1) {
						states[i]=1;//订将状态值置为已完成
						System.out.println("订单签收成功！");
						isSingFind=true;//标记已找到此订单
					}else if(names[i]!=null&&states[i]==1&&singOrderId==i+1) {
						System.out.println("您选择的订单已完成签收，不能再次签收！");
						isSingFind=true;//标记已找到此订单
					}
				}
				 //未找到的订单序号：不可签收你
				 if (!isSingFind) {
					System.out.println("您选择的订单不存在！");
				}
				 break;
			case 4:
				 //删除订单
				 System.out.println("***删除订单***");
				 break;
			case 5:
				 //我要点赞
				 System.out.println("***我要点赞***");
				 break;
			case 6: //退出订餐	
			default://功能编号录入错误，认为退出系统
				 System.out.println("***退出订餐***");
				 isExit=true;
				 break;
			}
			
			
			if (!isExit) {//不退出系统,录入0可以返回主菜单
				System.out.print("输入0返回主菜单");
				num=input.nextInt();
			}else {//结束循环
				break;
			}
		}while(num==0);
	}

}
