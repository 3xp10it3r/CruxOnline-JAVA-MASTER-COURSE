package Section10_OopsAndStack.Stack;

public class StackClient {

	public static void main(String[] args) throws Exception {

		StackUsingArrays stack = new StackUsingArrays(5);
		for (int i = 0; i < 5; i++) {
			stack.push(i * 10);
		}
		stack.Display();
//		stack.push(50); // full capacity
//		System.out.println(stack.top());
//		System.out.println(stack.pop());
		stack.pop();
		stack.Display();
		while(!stack.isEmpty() == true) {
			stack.pop();
		}
		stack.Display();
		stack.pop();
	}

}
