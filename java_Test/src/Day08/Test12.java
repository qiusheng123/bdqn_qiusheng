package Day08;

public class Test12 {
	public double SystemTime() {// ��ȡ��ǰϵͳʱ�䡣
		// 1970��0ʱ�����ڵ�ʱ��
		long time = System.currentTimeMillis();
		return time;
	}

	public static void main(String[] args) {
		Test12 test = new Test12();
		double count = 0;
		double count1 = 0;
		for (int i = 0; i < 10000; i++) {
			double[] arr = new double[i+1];
			if (i == 0) {
				count = test.SystemTime();//��¼������һ������ĵ�ǰʱ��
			} else if (i == arr.length - 1) {
				count1 = test.SystemTime();//��¼�������һ������ĵ�ǰʱ��
			}
		}
		System.out.println(count1 - count);
	}
}
