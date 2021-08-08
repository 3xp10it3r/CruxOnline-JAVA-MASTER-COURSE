package RecursionPrint;

public class PrintMazePath {
	public static void main(String[] args) {
			printMazePath(0, 0, 2, 2, "");
			int c = countMazePath(0, 0, 2, 2);
			System.out.println(c);
	}

	public static void printMazePath(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}

		printMazePath(cr, cc + 1, er, ec, ans + "H");
		printMazePath(cr + 1, cc, er, ec, ans + "V");
	}

	public static int countMazePath(int cr,int cc,int er,int ec) {
		if(cr==er && cc == ec) {
			return 1;
		}
		if(cr > er || cc > ec) {
			return 0;
		}
		int ch = countMazePath(cr, cc+1, er, ec);
		int cv = countMazePath(cr+1, cc, er, ec);
		
		return ch+cv;
	}
}
