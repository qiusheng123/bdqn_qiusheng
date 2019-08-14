package day09;
/*
 * 手机测试类
 */
public class Test {

	public static void main(String[] args) {
		AptitudeHandset ap=new AptitudeHandset("apple","X MAX");
		ap.call();
		ap.networkConn();
		ap.play("兰心大战雷德王");
		ap.sendInfo();
		ap.info();
			
		CommonHandset common=new CommonHandset("apple","X R");
		common.call();
		common.play("陈浩之歌");
		common.info();
	}

}
