package Section10_OopsAndStack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String str = sc.nextLine();
		System.out.println(isBalanced(str));
	}
	
	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		for(int i  = 0 ; i < str.length() ; i++) {
			if(str.charAt(i)== '{' || str.charAt(i)=='[' || str.charAt(i)=='(') {
				stack.push(str.charAt(i));
			}
			if(str.charAt(i)=='}' || str.charAt(i)==']' || str.charAt(i)==')') {
				if(stack.empty()) {
					return false;
				}
				if((str.charAt(i) == '}' && stack.peek() == '{')||(str.charAt(i)==']' && stack.peek() =='[')||(str.charAt(i)==')' && stack.peek() == '(')) {
					stack.pop();
				}else {
					return false;
				}
			}
		}
		if(!stack.empty()) {
			return false;
		}
		return true;
	}
}
