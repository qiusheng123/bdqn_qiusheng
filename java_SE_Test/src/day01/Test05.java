package day01;
/*
 * 1���ַ���"#hh123@",�ж��Ƿ���"#"��ʼ��"@"��β�����ǣ��򽫸��ַ�����"hh123"��ȡ����
 * 2��Ȼ�����жϴ����ַ����ĳ������Ƿ�Ϊ10��������������ں������0�Զ����䵽10�����ȡ�
 */
public class Test05 {
	public static void main(String[] args) {
		String str="#hh123@";
		
		boolean str1=str.startsWith("#");
		boolean str2=str.endsWith("@");
		if (str1&&str2) {
			System.out.println("���ַ�������#��ͷ��@��β");
		}else {
			System.out.println("���ַ���������#��ͷ��@��β");
		}
		String str3=str.substring(1,6);
		
		StringBuilder sb=new StringBuilder(str3);
		
		//�ж����ַ������Ƿ�Ϊ10
		while(sb.length()<10) {
			
			sb.append("0");
		}
		//ת����String����
		String st1=sb.toString();
		System.out.println(st1);
	}
}
