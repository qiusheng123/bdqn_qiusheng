package day09;
/*
 * ��ͨ�ֻ�
 */
public class CommonHandset extends Handset implements PlayWiring {
	
	
	public CommonHandset() {
		super();
	}

	public CommonHandset(String brand, String type) {
		super(brand, type);
	}

	public void sendInfo() {
		System.out.println("-----����������Ϣ-----");
	}

	public void call() {
		System.out.println("-----�Ѿ���ʼͨ��------");
	}

	public void play(String content) {
		System.out.println("-----��ʼ�����֡�"+content+"��-----");
	}
		
}
