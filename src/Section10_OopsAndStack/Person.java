package Section10_OopsAndStack;

public class Person {

	private String name;
	private int age;
	
	public Person() {
		System.out.println("I am in Default constructor..");
	}
	
	public Person(int age) {
		System.out.println("Im in parameterized constructor with 1 param");
		this.age = age;
	}
	
	public Person(int age , String name) {
		System.out.println("Im in parameterized constructor with 2 params");
		this.age = age;
		this.name = name;
	}

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
