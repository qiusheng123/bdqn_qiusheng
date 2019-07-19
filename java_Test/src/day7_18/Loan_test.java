package day7_18;

public class Loan_test {

	public static void main(String[] args) {
		Loan loan1=new Loan();
		System.out.print("请输入贷款金额：");
		loan1.LoanMoney();
		System.out.print("请选择贷款年限：1.3年（36个月）  2.5年（60个月）  3.20年（240个月）");
		loan1.loan(0, 0);
		
		System.out.println("****月供为："+loan1.monthPay);
	}

}
