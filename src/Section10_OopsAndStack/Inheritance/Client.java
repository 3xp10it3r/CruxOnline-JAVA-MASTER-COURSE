package Section10_OopsAndStack.Inheritance;

public class Client {

	public static void main(String[] args) {
//		P obj = new P();
//		System.out.println(obj.d); //10
//		System.out.println(obj.d1); //100
//		C obj = new C();
//		System.out.println(obj.d); 

		System.out.println("--case 1 -- ");
		P obj1 = new P();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
		obj1.fun();
		obj1.fun1();

		System.out.println("--case 2 -- ");
		P obj2 = new C();
		System.out.println(obj2.d);
		System.out.println(((C) obj2).d2);
		obj2.fun();
		((C) obj2).fun2();

		System.out.println("--Case 3 -- ");
//		C obj3 = new P();
//		System.out.println(obj3.d);
//		System.out.println(obj3.d1);
//		System.out.println(obj3.d2);
		
		System.out.println("--Case 4-- c to c");
		C obj4 = new C();
		System.out.println(obj4.d); //20
		System.out.println(((P)obj4).d); //10
		System.out.println(obj4.d1);
		System.out.println(obj4.d2);
		obj4.fun(); //same
		((P)obj4).fun(); //same
		obj4.fun1();
		obj4.fun2();
	}

}
