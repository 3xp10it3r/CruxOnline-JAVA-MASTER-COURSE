package Section10_OopsAndStack.Stack;

public class ClientReverseStack {

	public static void main(String[] args) throws Exception {

		StackUsingArrays stack = new StackUsingArrays(5);

		for (int i = 1; i < 6; i++) {
			stack.push(i * 10);
		}
		stack.Display();

		StackUsingArrays helper = new StackUsingArrays(5);
		reverseStack(stack, helper, 0);
		stack.Display();
	}

	public static void reverseStack(StackUsingArrays stack, StackUsingArrays helper, int index) throws Exception {
		if (stack.isEmpty()) {
			return;
		}
		int item = stack.pop();
		reverseStack(stack, helper, index + 1);
		helper.push(item);
		if (index == 0) {
			while (!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}
	}
}
