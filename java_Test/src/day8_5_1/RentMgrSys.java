package day8_5_1;

import java.util.Scanner;

public class RentMgrSys {

	public static void main(String[] args) {
		carBusiness carBus=new carBusiness();
		
		Scanner input=new Scanner(System.in);
		  System.out.println("***********��ӭ�����ڷ��������޹�˾*************");
		  System.out.println("1���γ�  \t  2���ͳ�");
		  System.out.print("��������Ҫ���޵���������:");
		  int motoType=input.nextInt();
		  //Ԥ�ȶ���ã�����ҵ�����motoLeaseOut����������
		  String brand="";
		  String type="";
		  int seat=0;
		  
		  if(motoType==1) {//�û�ѡ��γ�
			  System.out.print("��ѡ����Ҫ���޵�����Ʒ��:1�����  2������");
			  int choose2=input.nextInt();
			  if(choose2==1) {
				  brand="���";
				  System.out.print("��ѡ����Ҫ���޵������ͺ�:1��������  2��GL8");
				  type=(input.nextInt() ==1)? "������":"GL8";
			  }else if(choose2==2){
				  brand="����";
				  System.out.println("��ѡ����Ҫ���޵������ͺ�:1��X6 2��550i");
				  type=(input.nextInt() ==1)? "X6":"550i";
			  }
		  }else if(motoType==2){//�û�ѡ��ͳ�
			    type="";
				System.out.print("��ѡ����Ҫ���޵�����Ʒ�ƣ�1������ 2����");	
				brand=(input.nextInt()==1)?"����":"��";
				System.out.print("��ѡ����Ҫ���޵�������λ����1��16�� 2��34��");
				seat=(input.nextInt()==1)?16:34;  
		  }
			Car moto = carBus.carChoose(brand,type,seat);//��� 
			System.out.print("��������Ҫ���޵�������");
			int days=input.nextInt();
			double money=moto.discount(days);//���޷���
			System.out.println("��������������ƺ��ǣ�"+moto.getCarNo());
			System.out.println("����Ҫ֧�������޷����ǣ�"+money+"Ԫ��");
		  
	}	

}
