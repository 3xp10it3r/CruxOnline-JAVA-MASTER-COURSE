package RecursionGet;

import java.util.ArrayList;

public class GetSubsequences {
	public static void main(String[] args) {
		System.out.println(getSS("abc"));
	}
	
	public static ArrayList<String> getSS(String str){
		if(str.length()==0) {
			ArrayList<String> baseAr = new ArrayList<>();
			baseAr.add(" ");
			return baseAr;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String>myRes = new ArrayList<>();
		ArrayList<String> rosRes = getSS(ros);
		for(int i = 0 ;  i < rosRes.size() ; i++) {
			myRes.add(rosRes.get(i));
			myRes.add(cc+rosRes.get(i));
		}
		return myRes;
		
	}
}
