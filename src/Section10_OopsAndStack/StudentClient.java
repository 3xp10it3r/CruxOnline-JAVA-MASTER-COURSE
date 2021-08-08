package Section10_OopsAndStack;

public class StudentClient {

	public static void main(String[] args) throws Exception {
		// array is created . no student created yet...
		Student[] students = new Student[1000];
		
		for(int i  =0 ; i < students.length ; i++) {
			students[i] = new Student(i+"th");
			
			System.out.println(Student.getNoOfStudents());
		}
		//Able to access static field but can't change the value..
//		Student.MAX_STUDENTS = 2000;
		
//		students[250].rollNo = 10;
		System.out.println(students[250].rollNo);
		
		System.out.println(students[250].getName());
		students[250].setName("ABC");
		System.out.println(students[250].getName());
		
		students[250].aNonStaticFunction();
		students[250].aStaticFunction();
		
		Student.aStaticFunction();
		
		students[250].setUniformColor("blue");
		System.out.println(students[350].getUniformColor());

	}

}
