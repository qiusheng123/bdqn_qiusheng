package day7_18;

import java.time.Month;
import java.util.Scanner;

/*
 * ���������¹�������
 */
public class Loan {
	double money;//������
	double yearchoice;//��������Ϣ
	double monthPay;
	
	public void LoanMoney() {
		Scanner input=new Scanner(System.in);
		money=input.nextDouble();
	}
	public double loan(double loan,int yearchoice) {
		double interest;
		
		Scanner input=new Scanner(System.in);
		yearchoice=input.nextInt();
	
		switch (yearchoice) {
		case 1://3��36����
			interest=money*0.0603;
			monthPay=((money+interest)/36);
			break;
		case 2://5��60����
			interest=money*0.0612;
			monthPay=((money+interest)/60);
			break;
		case 3://20��240����
			interest=money*0.0639;
			monthPay=((money+interest)/240);
			break;
			
		default:
			System.out.println("��ѡ�����������������ѡ��");
			break;
		}
		return monthPay;
	}
}
