package Demo01_oop;
/*
 * 有一个对象，能存放5个一个水杯。
 */
public class Test_08 {
	Cup[] cups = new Cup[] { new Cup(), new Cup(), new Cup(), new Cup(), new Cup() };
}

class Cup {
	String name;// 水杯名字
	String color;// 水杯燃烧
	String size;// 水杯大小
}