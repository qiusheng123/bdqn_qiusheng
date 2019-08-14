package day01;
/*
 * 有一个字符串 qwertyy123df    dsgfag，请问如何判断这个字符串中包含123？
 */
public class Test01 {

	public static void main(String[] args) {
		String str="qwertyy123df";
		
		int a=str.indexOf("1");
		int b=str.indexOf("2");
		int c=str.indexOf("3");
		if (a!=-1&&b!=-1&&c!=-1) {
			System.out.println("该字符串包含123");
		}else {
			System.out.println("该字符串不包含123");
		}
		
	}

}
