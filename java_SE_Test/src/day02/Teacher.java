package day02;
/*
 * 1��toString��equals�������Ը���
 * 2��toString�ڸ����еĹ����ǣ�Ĭ�Ϸ��ظö���ʵ����ġ�����+@+hashcode��ֵ��
 * equals�ڸ�����еĹ����ǣ��ж���������ĵ�ַ�Ƿ�һ����
 * 
 * 
 * ��дһ��Teacher�࣬������name��sex��
��дtoString������Ҫ���ӡTeacher��Ķ���ʱ���ܹ����
������:  name��sex��ֵ����
��дequals������Ҫ��Ƚ�Teacher�����������ʱ��������ͬ���߶���������ֵһ��������true��

 */
public class Teacher {
	private String name;
	private String sex;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	//��дtoString����
	public String toString() {
		
		return "������Teacher������"+this.name+" �Ա�"+this.sex;
	}
	
	//��дequals����
	public boolean equals(Object obj) {
		if (obj instanceof Teacher) {
			Teacher other=(Teacher)obj;
			if (obj==this||(name==other.name&&sex==other.sex)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

}
