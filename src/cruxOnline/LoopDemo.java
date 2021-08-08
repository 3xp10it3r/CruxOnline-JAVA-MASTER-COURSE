package cruxOnline;

public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
		}
		
		int c = 1;
		for(;c<10;c++) {
			System.out.println(c);
		}
		
		for(;c<10;) {
			System.out.println(c);
			c+=1;
		}
		for(;;) {
			System.out.println("Infinte Loop");
		}
		
	}

}
