package ArrayListAnd2Darray;

import java.util.ArrayList;
public class arrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list.get(2));
		
		System.out.println(list.remove(3));;
		list.remove(0);
		System.out.println(list);
		System.out.println(list.size());
	}

}
