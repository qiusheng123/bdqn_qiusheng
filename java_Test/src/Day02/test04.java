package Day02;

import java.util.Arrays;

/*
 * 4���ڿ���̨����žų˷������ݶ�ά�����ṩѭ����������
 */
public class test04 {

	public static void main(String[] args) {
		String [][]arr=new String[9][9];
		for (int i = 0; i <arr.length; i++) {
			arr[i]=Arrays.copyOf(arr[i],i+1);//�ı����鳤��
			for (int j = 0; j <= i; j++) {
				arr[i][j]=(i+1)+"*"+(j+1);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
