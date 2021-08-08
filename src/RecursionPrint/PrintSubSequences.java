package RecursionPrint;

public class PrintSubSequences {

	public static void main(String[] args) {
		getSubsequences("abc", "");
	}

	public static void getSubsequences(String str, String result) {
		if (str.length() == 0) {
			System.out.println(result);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		getSubsequences(ros, result);
		getSubsequences(ros, result + cc);
	}

}
