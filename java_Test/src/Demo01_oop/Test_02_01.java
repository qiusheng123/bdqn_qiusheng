package Demo01_oop;

public class Test_02_01 {
	public static void main(String[] args) {
		Test_02 ch=new Test_02();
		ch.name="陈浩";
		ch.age=20;
		ch.weight=60;
		ch.sex="男";
		System.out.println(ch.name+"  "+ch.age+"岁 "+ch.weight+"kg "+"性别："+ch.sex);
		ch.study("上午体育课，下午音乐课！");
		
		Test_02 zhh=new Test_02();
		zhh.name="张花花";
		zhh.age=27;
		zhh.weight=48;
		zhh.sex="女";
		System.out.println(zhh.name+"  "+zhh.age+"岁 "+zhh.weight+"kg "+"性别："+zhh.sex);
		ch.study("上午数学课，下午开班会！");
		
	}
}
