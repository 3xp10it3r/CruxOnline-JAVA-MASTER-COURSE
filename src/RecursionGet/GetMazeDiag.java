package RecursionGet;

import java.util.ArrayList;

public class GetMazeDiag {
	public static void main(String[] args) {
		System.out.println(getMazePathDiag(0, 0, 2, 2));
		System.out.println(getMazePathDiag(0, 0, 2, 2).size());
	}

	public static ArrayList<String> getMazePathDiag(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rrh = getMazePathDiag(cr, cc + 1, er, ec);
		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}
		ArrayList<String> rrv = getMazePathDiag(cr + 1, cc, er, ec);
		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}
		ArrayList<String> rrd = getMazePathDiag(cr + 1, cc + 1, er, ec);
		for (String rrds : rrd) {
			mr.add("D" + rrds);
		}
		return mr;
	}
}
