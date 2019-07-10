package Demo01_oop;

/*
 * 9、有一个学生信息管理系统StudentsBiz，可以保存30个学生姓名列表。
 * 并有能力增加学生姓名；有能力显示本班的学生姓名列表；有能力在一定区间查找学生姓名。测试效果：
 */
public class StudentBiz {
	//学生姓名列表
	String[] names = new String[30]; // 学员姓名数组

	/**
	 * 添加学生姓名
	 * @param name 要增加的姓名
	 */
	public void addName(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				//遍历学生姓名列表，遇到第一个null赋值，并结束
				names[i] = name;
				break;
			}
		}
	}

	/**
	 * 显示学生姓名
	 * 
	 */
	public void showNames() {
		System.out.println("本班学生列表：");
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null) {//排除掉学生列表数组为null的元素
				System.out.print(names[i] + "\t");
			}
		}
		System.out.println();
	}

	/**
	 * 在一定区间查找学生姓名
	 * 
	 * @param start
	 *            开始位置
	 * @param end
	 *            结束位置
	 * @param name
	 *            查找的姓名
	 * @return find 是否查找成功 true为查到
	 */
	public boolean searchName(int start, int end, String name) {
		boolean find = false; // 是否找到标识

		// 指定区间数组中，查找姓名
		for (int i = start - 1; i < end; i++) {
			if (name.equals(names[i])) {
				find = true;
				break;
			}
		}
		return find;
	}
}
