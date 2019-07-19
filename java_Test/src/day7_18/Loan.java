package day7_18;

import java.time.Month;
import java.util.Scanner;

/*
 * 购房贷款月供计算器
 */
public class Loan {
	double money;//贷款金额
	double yearchoice;//贷款总利息
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
		case 1://3年36个月
			interest=money*0.0603;
			monthPay=((money+interest)/36);
			break;
		case 2://5年60个月
			interest=money*0.0612;
			monthPay=((money+interest)/60);
			break;
		case 3://20年240个月
			interest=money*0.0639;
			monthPay=((money+interest)/240);
			break;
			
		default:
			System.out.println("你选择的期数错误，请重新选择！");
			break;
		}
		return monthPay;
	}
}
