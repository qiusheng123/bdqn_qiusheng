package day01;
/*
 * 1、字符串"#hh123@",判断是否以"#"开始，"@"结尾。如是，则将该字符串的"hh123"截取出来
 * 2、然后在判断此子字符串的长度是是否为10，如果不够，则在后面添加0自动补充到10个长度。
 */
public class Test05 {
	public static void main(String[] args) {
		String str="#hh123@";
		
		boolean str1=str.startsWith("#");
		boolean str2=str.endsWith("@");
		if (str1&&str2) {
			System.out.println("该字符串是以#开头和@结尾");
		}else {
			System.out.println("该字符串不是以#开头和@结尾");
		}
		String str3=str.substring(1,6);
		
		StringBuilder sb=new StringBuilder(str3);
		
		//判断子字符长度是否为10
		while(sb.length()<10) {
			
			sb.append("0");
		}
		//转换成String类型
		String st1=sb.toString();
		System.out.println(st1);
	}
}
