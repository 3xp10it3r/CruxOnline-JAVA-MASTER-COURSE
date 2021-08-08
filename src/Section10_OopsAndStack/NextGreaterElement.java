package Section10_OopsAndStack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			while (!stack.empty() && arr[i] > stack.peek()) {
				int rv = stack.pop();
				System.out.println(rv + "-->" + arr[i]);
			}
			stack.push(arr[i]);
		}
		while (!stack.empty()) {
			System.out.println(stack.pop() + "-->" + (-1));
		}
	}

}
