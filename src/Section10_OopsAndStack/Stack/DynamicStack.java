package Section10_OopsAndStack.Stack;

public class DynamicStack extends StackUsingArrays {
	
	public DynamicStack() throws Exception {
		this(DEFAULT_CAPACITY);
	}
	
	public DynamicStack(int capacity) throws Exception {
		super(capacity);
	}
	
	public void push(int item) throws Exception{
		if(this.data.length == this.size()) {
			int [] arr = new int[2*this.data.length];
			for(int i = 0 ; i < size();i++) {
				arr[i] = this.data[i];
			}	
			this.data = arr;
		}
		super.push(item);
	}

}
