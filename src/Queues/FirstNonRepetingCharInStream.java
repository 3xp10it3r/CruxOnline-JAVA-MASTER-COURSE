package Queues;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNonRepetingCharInStream {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		long time = System.currentTimeMillis();
		Queue<Character> queue = new LinkedList<>();
		HashMap<Character, Integer> map = new HashMap<>();
		
		while(ch!='.') {
			queue.add(ch);
			if(map.containsKey(ch)) {
				int ov = map.get(ch);
				ov+=1;
				map.put(ch, ov);
			}else {
				map.put(ch, 1);
			}
//			while(!queue.isEmpty() && map.get(queue.peek())!=1) {
//				queue.poll();
//			}
//			if(queue.isEmpty()) {
//				System.out.println("-1");
//			}else {
//				System.out.println(queue.peek());
//			}
			while(!queue.isEmpty()) {
				char fc = queue.peek();
				if(map.get(fc)==1) {
					System.out.println(fc);
					break;
				}else {
					queue.poll();
				}
			}
			if(queue.isEmpty()) {
				System.out.println("-1");
			}
			ch = sc.next().charAt(0);
		}
		long ftime = System.currentTimeMillis();
		System.out.println( ftime - time);

	}

}
