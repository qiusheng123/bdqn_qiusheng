package day09;
/*
 * 智能手机
 */
public class AptitudeHandset extends Handset implements ThakePictures,Network,PlayWiring {
	
    public AptitudeHandset() {
    	
	}
	
	public AptitudeHandset(String brand, String type) {
		super(brand, type);
	}


	public void sendInfo() {
		System.out.println("-----发送图片和文字信息-----");
	}

	public void call() {
		System.out.println("-----已经开始通话------");
	}

	public void play(String content) {
		System.out.println("-----开始播放视频《"+content+"》-----");
	}

	public void networkConn() {
		System.out.println("-----已经启动5G网络-----");
	}

	public void takePictures() {
		System.out.println("----咔嚓-----照片成功，留下你的盛世容颜----");
	}

}
