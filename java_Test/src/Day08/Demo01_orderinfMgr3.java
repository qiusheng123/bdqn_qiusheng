package Day08;

import java.util.Scanner;


/*
 * �Ի����˶���ϵͳ
 */
public class Demo01_orderinfMgr3 {
		
	public static void main(String[] args) {
		//�����Ʒ���飬������
		String[] dishNames= {"���մ���","������˿","ʱ������"}; //��Ʒ����
		double[] prices= {38.0,20.0,10.0};//��Ʒ����
		int[] praiseNums=new int[3];//��������Ĭ��ֵΪ0
		
		//���嶩�����飬���4������
		String[]names=new String[4];//����������
		String[]dishMegs=new String[4];//��ѡ��Ʒ��������Ʒ���Լ�����
		int[]times=new int[4];//�Ͳ�ʱ��
		String[]addresses=new String[4];//�Ͳ͵�ַ
		int[]states=new int[4];//����״̬��0��ʾ��Ԥ����1��ʾ�����
		double[]sumPrices=new double[4];//�ܽ��
		
		Scanner input=new Scanner(System.in);
		int num=-1;//�û�¼��0�������˵��������˳�ϵͳ
		boolean isExit=false;//��־�û��Ƿ��˳�ϵͳ��true�˳�ϵͳ��
		//ѭ����ʾϵͳ�˵����û�����¼�������ִ����Ӧ�Ĺ���
		do {
			System.out.println("**********************************");
			System.out.println("1����Ҫ����");
			System.out.println("2���鿴����");
			System.out.println("3��ǩ�ն���");
			System.out.println("4��ɾ������");
			System.out.println("5����Ҫ����");
			System.out.println("6���˳�ϵͳ");
			System.out.println("**********************************");
			System.out.print("��ѡ��");
			int choose=input.nextInt();//��¼�û����
			
			/*
			 * �����û����빦�ܱ�ţ�ִ����Ӧ�Ĺ��ܡ�
			 */
			switch (choose) {
			case 1:
				 //��Ҫ����				
				 System.out.println("***��Ҫ����***");
				 boolean isAdd=false;//��¼�ʹ��Ƿ�Ϊ��
				 //��ʾ��Ʒ
				 for(int j=0;j<names.length;j++) {
					 if(names[j]==null) {//�ҵ���һ����λ�ã�������Ӷ���
						 isAdd=true;//�ñ�־λ�����Զ���
						 System.out.println("���"+"\t"+"����"+"\t"+"����"+"\t"+"������");
						 for(int i=0;i<dishNames.length;i++) {
							 String pri=prices[i]+"Ԫ";
							 String praiseNum=praiseNums[i]>0?(praiseNums[i]+"��"):"0";
							 System.out.println((i+1)+"\t"+dishNames[i]+"\t"+pri+"\t"+praiseNum);
						 }
						 
						 //�û�ѡ���Ʒ
						 System.out.print("�����붩����������");
						 String name=input.next();
						 System.out.print("��ѡ����Ҫ�Ĳ�Ʒ���룺");
						 int chooseDish=input.nextInt();
						 System.out.print("��ѡ������Ҫ�ķ�����");
						 int number=input.nextInt();
						String dishMeg= dishNames[chooseDish-1]+""+number+"��";
						double sumPrice=prices[chooseDish-1]*number;
						
						//�ͷ���50Ԫ�����Ͳͷ�5Ԫ
						double deliCharge=(sumPrice>=50)?0:5;
						
						System.out.println("�������Ͳ�ʱ�䣨�Ͳ�ʱ����10�㵽20��������Ͳͣ���");
						int time=input.nextInt();
						while(time<10||time>20) {
							System.out.println("������������������10~20֮���������");
								time=input.nextInt();
						}
						//�Ͳ͵�ַ
						System.out.println("�������Ͳ͵�ַ��");
						String address=input.next();  
						
						//�������״̬��Ĭ��Ϊ0������Ԥ��״̬
						System.out.println("���ͳɹ���");
						System.out.println("�������ǣ�"+dishMeg);
						System.out.println("�Ͳ�ʱ�䣺"+time+"��");
						System.out.println("�ͷѣ�"+sumPrice+"Ԫ���Ͳͷ�"+deliCharge+"Ԫ���ܼƣ�"
						+(sumPrice+deliCharge)+"Ԫ");
						
						//�������
						names[j]=name;
						dishMegs[j]=dishMeg;
						times[j]=time;
						addresses[j]=address;
						sumPrices[j]=sumPrice;
						 break;
					}					 			 
				 }
					  if(!isAdd) {
						   System.out.println("�Բ������Ĳʹ�����");
					   }
				 break;
			case 2:	
				 //�鿴�ʹ�
				 System.out.println("***�鿴�ʹ�***");
				 System.out.println("���\t������\t��Ʒ��Ϣ\t\t�Ͳ�ʱ��\t�Ͳ͵�ַ\t�ܽ��\t����״̬");
				 for (int i = 0; i < names.length; i++) {
					if (names[i]!=null) {
						String state=(states[i]==0)?"��Ԥ��":"�����";
						String date=times[i]+"��";
						String sumPrice=sumPrices[i]+"Ԫ";
						System.out.println((i+1)+"\t"+names[i]+"\t"+dishMegs[i]
								+"\t"+date+"\t"+addresses[i]+"\t"+sumPrices[i]+"\t"+state);
					}
				}
				 break;
			case 3:	
				 //ǩ�ն���
				 System.out.println("***ǩ�ն���***");
				 boolean isSingFind=false;//�ҵ�Ҫǩ�յĶ���
				 System.out.println("������Ҫǩ�յĶ�����ţ�");
				 int singOrderId=input.nextInt();
				 for (int i = 0; i < names.length; i++) {
					//״̬ΪԤ�������Ϊ�û�����Ķ�����ż�1����ǩ��
					//״̬Ϊ����ɣ����Ϊ�û�����Ķ����ż�1������ǩ��
					 if (names[i]!=null&&states[i]==0&&singOrderId==i+1) {
						states[i]=1;//����״ֵ̬��Ϊ�����
						System.out.println("����ǩ�ճɹ���");
						isSingFind=true;//������ҵ��˶���
					}else if(names[i]!=null&&states[i]==1&&singOrderId==i+1) {
						System.out.println("��ѡ��Ķ��������ǩ�գ������ٴ�ǩ�գ�");
						isSingFind=true;//������ҵ��˶���
					}
				}
				 //δ�ҵ��Ķ�����ţ�����ǩ����
				 if (!isSingFind) {
					System.out.println("��ѡ��Ķ��������ڣ�");
				}
				 break;
			case 4:
				 //ɾ������
				 System.out.println("***ɾ������***");
				 break;
			case 5:
				 //��Ҫ����
				 System.out.println("***��Ҫ����***");
				 break;
			case 6: //�˳�����	
			default://���ܱ��¼�������Ϊ�˳�ϵͳ
				 System.out.println("***�˳�����***");
				 isExit=true;
				 break;
			}
			
			
			if (!isExit) {//���˳�ϵͳ,¼��0���Է������˵�
				System.out.print("����0�������˵�");
				num=input.nextInt();
			}else {//����ѭ��
				break;
			}
		}while(num==0);
	}

}
