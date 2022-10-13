package day02;

public class BruteForce {

	public static void main(String[] args) {
		String s1 = "ABC이지스DEF";
		String s2 = "이지스";
		int idx = bfMatch(s1, s2);
	}
	
	private static int bfMatch(String txt, String pat) {
		int pt =0;
		int pp =0;
		System.out.println(txt.length() + " " + pat.length());
		while( pt !=txt.length() && pp != pat.length() ) {
			if(txt.charAt(pt) == pat.charAt(pp)) {
				pt++;
				pp++;
			}else {
				pt = pt - pp + 1;
			}
		}
		if(pp == pat.length()) {
			return pt - pp;
		}
		return -1;
	}

}
