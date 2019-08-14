package day01;
/*
 * 10、判断.java文件名是否正确
 */
public class Test09 {
	public static void main(String[] args) {
		String name="hello.java";
		
		//获取文件名中最后一次.出现的位置
		int index=name.lastIndexOf(".");
		
		//获取文件的后缀
		String str1=name.substring(name.lastIndexOf(".")+1);
		
		//判断必须包含“.”号，且不能出现首位，同时后缀名为java
		if (index!=-1&&index>0&&"java".equals(str1)) {
			System.out.println("文件名正确");
		}else {
			System.out.println("文件名不正确");
		}
	}
}
