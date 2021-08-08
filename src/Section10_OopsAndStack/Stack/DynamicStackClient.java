package Section10_OopsAndStack.Stack;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception{
			

		StackUsingArrays stack = new DynamicStack(5);
		for (int i = 0; i < 15; i++) {
			stack.push(i * 10);
		}
		stack.Display();
		stack.push(50);
		stack.push(60);
		System.out.println(stack.top());
//		System.out.println(stack.pop());
		stack.pop();
		stack.Display();
		while(!stack.isEmpty() == true) {
			stack.pop();
		}
		stack.Display();
//		stack.pop();
	}
}
