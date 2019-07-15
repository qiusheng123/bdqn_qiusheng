package Day08;

public class Test12 {
	public double SystemTime() {// 获取当前系统时间。
		// 1970年0时到现在的时间
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
				count = test.SystemTime();//记录创建第一个数组的当前时间
			} else if (i == arr.length - 1) {
				count1 = test.SystemTime();//记录创建最后一个数组的当前时间
			}
		}
		System.out.println(count1 - count);
	}
}
