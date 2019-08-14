package day09;
/*
 * 普通手机
 */
public class CommonHandset extends Handset implements PlayWiring {
	
	
	public CommonHandset() {
		super();
	}

	public CommonHandset(String brand, String type) {
		super(brand, type);
	}

	public void sendInfo() {
		System.out.println("-----发送文字信息-----");
	}

	public void call() {
		System.out.println("-----已经开始通话------");
	}

	public void play(String content) {
		System.out.println("-----开始播音乐《"+content+"》-----");
	}
		
}
