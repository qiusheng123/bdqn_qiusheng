package day09;
/*
 * �ֻ�����
 */
public abstract class Handset {
	private String brand;//Ʒ��
	private String type;//�ͺ�
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
//���췽��
	public Handset() {

	}
	
	public Handset(String brand, String type) {
		this.brand = brand;
		this.type = type;
	}

	/*
	 * ����Ϣ
	 */
	public abstract void sendInfo();
	
	/*
	 * ��绰
	 */
	public abstract void call();
	
	/*
	 * �ֻ���Ϣ
	 */
	public  void info() {
		System.out.println("����һ���ͺ�Ϊ��"+type+"��"+brand+"�ֻ�\n");
	};
}
