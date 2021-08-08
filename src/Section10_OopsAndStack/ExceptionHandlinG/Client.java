package Section10_OopsAndStack.ExceptionHandlinG;

public class Client {

	public static void main(String[] args) throws Exception {

		Student o = new Student();
		try {
			o.setAge(-10);
			System.out.println("After statement");
		} catch (Exception e) {
			System.out.println("I m catched");
		}
		System.out.println(o.getAge());
	}

}
