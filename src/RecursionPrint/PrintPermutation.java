package RecursionPrint;

public class PrintPermutation {
	public static void main(String[] args) {
printPermutation("abc","");
	}
	public static void printPermutation(String ques,String res) {
		if(ques.length()==0) {
			System.out.println(res);
			return;
		}
		for(int i = 0 ; i < ques.length() ;i++) {
			char ch = ques.charAt(i);
			String roq = ques.substring(0,i)+ques.substring(i+1);
			printPermutation(roq, res+ch);
		}
	}
}
