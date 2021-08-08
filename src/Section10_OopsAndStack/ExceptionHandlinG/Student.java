package Section10_OopsAndStack.ExceptionHandlinG;

public class Student {

	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws Exception{
		if(age < 0 ) {
			throw new Exception("Age cannot be negative");
		}
		this.age = age;
	}
	
	
	
}
