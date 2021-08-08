package RecursionPrint;

public class PrintMazePathDiag {
	public static void main(String[] args) {
		printMazePathDiag(0, 0, 2, 2, "");
		int c = countMazePathDiag(0, 0, 2, 2);
		System.out.println(c);
	}

	public static void printMazePathDiag(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}

		printMazePathDiag(cr, cc + 1, er, ec, ans + "H");
		printMazePathDiag(cr + 1, cc, er, ec, ans + "V");
		printMazePathDiag(cr + 1, cc + 1, er, ec, ans + "D");
	}

	public static int countMazePathDiag(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		int ch = countMazePathDiag(cr, cc + 1, er, ec);
		int cv = countMazePathDiag(cr + 1, cc, er, ec);
		int cd = countMazePathDiag(cr + 1, cc + 1, er, ec);

		return ch + cv + cd;
	}
}
