package day09;
/*
 * �����ֻ�
 */
public class AptitudeHandset extends Handset implements ThakePictures,Network,PlayWiring {
	
    public AptitudeHandset() {
    	
	}
	
	public AptitudeHandset(String brand, String type) {
		super(brand, type);
	}


	public void sendInfo() {
		System.out.println("-----����ͼƬ��������Ϣ-----");
	}

	public void call() {
		System.out.println("-----�Ѿ���ʼͨ��------");
	}

	public void play(String content) {
		System.out.println("-----��ʼ������Ƶ��"+content+"��-----");
	}

	public void networkConn() {
		System.out.println("-----�Ѿ�����5G����-----");
	}

	public void takePictures() {
		System.out.println("----����-----��Ƭ�ɹ����������ʢ������----");
	}

}
