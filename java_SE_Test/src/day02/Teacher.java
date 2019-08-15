package day02;
/*
 * 1、toString和equals方法来自父类
 * 2、toString在父类中的功能是：默认返回该对象实现类的“类名+@+hashcode”值。
 * equals在父类的中的功能是：判断两个对象的地址是否一样。
 * 
 * 
 * 编写一个Teacher类，有属性name，sex。
重写toString方法。要求打印Teacher类的对象时，能够输出
”类名:  name，sex的值”。
重写equals方法，要求比较Teacher类的两个对象时，对象相同或者对象中属性值一样，返回true。

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
	//重写toString方法
	public String toString() {
		
		return "类名：Teacher姓名："+this.name+" 性别："+this.sex;
	}
	
	//重写equals方法
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
