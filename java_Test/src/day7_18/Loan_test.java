package day7_18;

public class Loan_test {

	public static void main(String[] args) {
		Loan loan1=new Loan();
		System.out.print("����������");
		loan1.LoanMoney();
		System.out.print("��ѡ��������ޣ�1.3�꣨36���£�  2.5�꣨60���£�  3.20�꣨240���£�");
		loan1.loan(0, 0);
		
		System.out.println("****�¹�Ϊ��"+loan1.monthPay);
	}

}
