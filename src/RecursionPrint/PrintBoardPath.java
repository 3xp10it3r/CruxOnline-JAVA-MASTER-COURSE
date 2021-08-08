package RecursionPrint;

public class PrintBoardPath {
	public static void main(String[] args) {
//		printBoardPath(0, 10, "");
		int c =countBoardPath(0, 10);
		System.out.println(c);
	}

	public static void printBoardPath(int curr, int end, String ans) {
		if (curr == end) {
			System.out.println(ans);
			return;
		}
		if (curr > end) {
			return;
		}
		for (int dice = 1; dice <= 6; dice++) {
			printBoardPath(curr + dice, end, ans + dice);
		}
	}
	
	public static int countBoardPath(int curr , int end) {
		if(curr == end) {
			return 1;
		}
		if(curr > end) {
			return 0;
		}
		int count = 0;
		for(int dice = 1 ; dice <= 6 ; dice++) {
			count+=countBoardPath(curr+dice, end);
		}
		return count;
	}
}
