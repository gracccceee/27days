package day11_test_01;

public class Student02 {
	
	//成员变量
	private String name;
	private int age;
	
	//无参构造方法
	public Student02() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//带参构造方法 source generate Constructor
	public Student02(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//成员方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	}

