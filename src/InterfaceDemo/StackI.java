package InterfaceDemo;

public interface StackI {
	int size = 0; // static and final by default

	public void push(int item);

	public int pop();
}
