package Section10_OopsAndStack;

public class PersonClient {

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person();
		
		Person p3 = new Person(25);
		Person p4 = new Person(30,"Happy");
		
//		System.out.println(p1.name);
//		System.out.println(p1.age);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
//		p2.name = "Digvijay";
//		p2.age = 20;
		
		p2.setName("Happy Gupta");
		p2.setAge(20);
		
//		System.out.println(p2.name);
//		System.out.println(p2.age);

		System.out.println(p2.getName());
		System.out.println(p2.getAge());
	
		System.out.println(p3.getAge());
		System.out.println(p3.getName());
		
		System.out.println(p4.getAge());
		System.out.println(p4.getName());
	}

}
