package Demo01_oop;

public class Test_04 {

	public static void main(String[] args) {
		Student zs=new Student();
		zs.name="����";
		zs.age=18;
		zs.score=88;
		zs.remark="����ģ�⿼�Գɼ�����ϴ�";
		System.out.println("������"+zs.name+"\n���䣺"+zs.age+"\n"+"�ɼ���"+zs.score
				+"\n"+"��ʦ�ı�ע:"+zs.remark);
		zs.xian();
		
		Student ls=new Student();
		ls.name="����";
		ls.age=19;
		ls.score=95.5;
		ls.remark="����ģ�⿼�Գɼ��Ƚ��ȶ���ϣ�����ַ��ӡ�";
		System.out.println("������"+ls.name+"\n���䣺"+ls.age+"\n"+"�ɼ���"+ls.score
				+"\n"+"��ʦ�ı�ע:"+ls.remark);
		ls.xian();
		
	}

}
