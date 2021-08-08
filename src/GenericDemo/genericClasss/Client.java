package GenericDemo.genericClasss;

public class Client {
	public static void main(String[] args) {
		pair<Integer> pair1 = new pair<>();
		pair1.one = 1;
		pair1.two = 2;

		pair<String> pair11 = new pair<>();
		pair11.one = "h";
		pair11.two = "sdg";
		
		Pair2<Integer, String> p = new Pair2<>();
		p.one =1;
		p.two = "abc";
	}
}
