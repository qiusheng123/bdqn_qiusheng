package Demo01_oop;

/*
 * 9����һ��ѧ����Ϣ����ϵͳStudentsBiz�����Ա���30��ѧ�������б�
 * ������������ѧ����������������ʾ�����ѧ�������б���������һ���������ѧ������������Ч����
 */
public class StudentBiz {
	//ѧ�������б�
	String[] names = new String[30]; // ѧԱ��������

	/**
	 * ���ѧ������
	 * @param name Ҫ���ӵ�����
	 */
	public void addName(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				//����ѧ�������б�������һ��null��ֵ��������
				names[i] = name;
				break;
			}
		}
	}

	/**
	 * ��ʾѧ������
	 * 
	 */
	public void showNames() {
		System.out.println("����ѧ���б�");
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null) {//�ų���ѧ���б�����Ϊnull��Ԫ��
				System.out.print(names[i] + "\t");
			}
		}
		System.out.println();
	}

	/**
	 * ��һ���������ѧ������
	 * 
	 * @param start
	 *            ��ʼλ��
	 * @param end
	 *            ����λ��
	 * @param name
	 *            ���ҵ�����
	 * @return find �Ƿ���ҳɹ� trueΪ�鵽
	 */
	public boolean searchName(int start, int end, String name) {
		boolean find = false; // �Ƿ��ҵ���ʶ

		// ָ�����������У���������
		for (int i = start - 1; i < end; i++) {
			if (name.equals(names[i])) {
				find = true;
				break;
			}
		}
		return find;
	}
}
