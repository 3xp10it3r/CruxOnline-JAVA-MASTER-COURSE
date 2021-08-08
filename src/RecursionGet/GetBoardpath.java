package RecursionGet;

import java.util.ArrayList;

//import com.sun.tools.javac.code.Attribute.Array;

public class GetBoardpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> res = new ArrayList<String>();
		res = getBoardpath(0, 10);
		System.out.println(res);
		System.out.println(res.size());
	}

	public static ArrayList<String> getBoardpath(int curr, int end) {
		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}
		if (curr > end) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> rr = getBoardpath(curr + dice, end);
			for (String rrs : rr) {
				mr.add(dice + rrs);
			}
		}
		return mr;
	}

}
