package Demo01_oop;

public class Test_04 {

	public static void main(String[] args) {
		Student zs=new Student();
		zs.name="张三";
		zs.age=18;
		zs.score=88;
		zs.remark="几次模拟考试成绩起伏较大。";
		System.out.println("姓名："+zs.name+"\n年龄："+zs.age+"\n"+"成绩："+zs.score
				+"\n"+"老师的备注:"+zs.remark);
		zs.xian();
		
		Student ls=new Student();
		ls.name="李四";
		ls.age=19;
		ls.score=95.5;
		ls.remark="几次模拟考试成绩比较稳定，希望保持发挥。";
		System.out.println("姓名："+ls.name+"\n年龄："+ls.age+"\n"+"成绩："+ls.score
				+"\n"+"老师的备注:"+ls.remark);
		ls.xian();
		
	}

}
