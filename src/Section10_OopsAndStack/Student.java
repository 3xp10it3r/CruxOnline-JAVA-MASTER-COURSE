package Section10_OopsAndStack;

public class Student {
	
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) throws Exception {
		if(name.equals("") || name==null) {
			throw new Exception("Name Can't Be null or empty");
		}
		this.name = name;
	}

	public final int rollNo;
	
	private static int noOfStudents = 0;

	public static int getNoOfStudents() {
		return Student.noOfStudents;
	}

	private static String UniformColor = "White";

	public static String getUniformColor() {
		return Student.UniformColor;
	}

	public static void setUniformColor(String uniformColor) {
		Student.UniformColor = uniformColor;
	}
	
	public static final int MAX_STUDENTS = 1000;
	
	public Student(String name) throws Exception{
		if(Student.noOfStudents == Student.MAX_STUDENTS) {
			throw new Exception("Max Limit Reached !");
		}
		this.setName(name);
		Student.noOfStudents++;
		this.rollNo = Student.noOfStudents;
	}
	
	//can access static and non static members
	public void aNonStaticFunction() {
		System.out.println(this.name  +" say hello to  " + Student.MAX_STUDENTS + " students");
	}
	//can access only static data member
	//can't use this
	//can't use non static data member
	//No need to create object . can be called directly by class name.
	public static void aStaticFunction() {
		System.out.println(Student.noOfStudents + " out of possible "+Student.MAX_STUDENTS );
	}

}
