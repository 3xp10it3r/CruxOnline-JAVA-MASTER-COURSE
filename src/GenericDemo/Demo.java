package GenericDemo;

public class Demo {

	public static void main(String[] args) {
		Integer[] arri = {1,2,4,5,7,3,44,23};
		display(arri);
		String[] arrs = {"sc","sdc","adf","aefe","aefr"};
		display(arrs);
	}
	
	public static <T> void display(T[] arr) {
		for(T val : arr) {
			System.out.print(val +" ");
		}
		System.out.println();
	}
}
