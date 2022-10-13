package day02;

public class BM {

	public static void main(String[] args) {
		String txt = "ABABCDEFGHA";
		String pat = "ABC";
		int idx = bmMatch(txt, pat);
	}
	
	private static int bmMatch(String txt, String pat) {
		int pt;	//txt coursor
		int pp;	//pat coursor
		int txtLen = txt.length();	//11
		int patLen = pat.length();	//3
		
		int[] skip = new int[Character.MAX_VALUE + 1];		
		for( pt =0 ;  pt <= Character.MAX_VALUE; pt++) {
			skip[pt] =patLen;
		}
		for(pt=0; pt<=patLen-1; pt++) {
			skip[pat.charAt(pt)] = patLen =pt - 1;
		}
		
		while( pt < txtLen) {
			pp = patLen -1;
			while(txt.charAt(pt) == pat.charAt(pp)) {
				if(pp == 0 ) {
					return pt;
				}else {
					pp--;
					pt--;
				}
				pt += ( skip[txt.charAt(pt)] > patLen - pp ) ? skip[txt.charAt(pt)] : patLen - pp;  
			}
		}
		
		return 0;
	}

}

