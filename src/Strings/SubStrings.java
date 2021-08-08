package Strings;

public class SubStrings {

	public static void main(String[] args) {
		
		String s = "abcd";
		Substrings(s);


	}
	public static void Substrings(String S) {
		for(int s = 0 ; s <= S.length() -1 ; s++) {
			for(int i = s+1 ; i<= S.length() ; i++) {
				System.out.println(S.substring(s,i));
			}
		}
	}

}
