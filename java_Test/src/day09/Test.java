package day09;
/*
 * �ֻ�������
 */
public class Test {

	public static void main(String[] args) {
		AptitudeHandset ap=new AptitudeHandset("apple","X MAX");
		ap.call();
		ap.networkConn();
		ap.play("���Ĵ�ս�׵���");
		ap.sendInfo();
		ap.info();
			
		CommonHandset common=new CommonHandset("apple","X R");
		common.call();
		common.play("�º�֮��");
		common.info();
	}

}
