package day02;

public class ArrayEx02 {

	public static void main(String[] args) {
		String[][] s = new String[5][2];
		s[0][0] = "0397134";
		s[0][1] = "김효진";
		s[1][0] = "0465345";
		s[1][1] = "이종협";
		s[2][0] = "0327214";
		s[2][1] = "서상춘";
		s[3][0] = "0487342";
		s[3][1] = "배영미";
		s[4][0] = "0512478";
		s[4][1] = "김예진";
		
		//2. 학번을 숫자로 변경
		
		int[] s1 = new int[5];
		
		for(int i = 0 ; i < 5 ; i++) {
			s1[i] = Integer.parseInt(s[i][0]);
		}
		
		//3. 학번이 제일 작은 사람 구하기
		int top = s1[0];
		for(int i = 0 ; i < 5; i++) {
			if(s1[i] < s1[i+1]) {
				top = s1[i+1];
			}else {
				continue;
			}
		}
		
		//3-1. 랭킹함수를 이용하여 학번이 제일 작은 사람 구하기 
		int[] s2 = new int[5];	//각 학번의 랭킹을 구하여 저장할 배열 
		for(int i=0 ; i <s1.length ; i++) {
			int cnt=0;
			for(int j = 0 ; j <s1.length ; j++) {
				if(s1[i] > s1[j]) {
					cnt++;
				}
			}
			s2[i] = cnt;
		}
		
		//4. 랭킹배열에 있는 값을 이용하여 so[][]배열에 넣기
		int[][] so = new int[5][2];
		for(int i = 0 ; i < s2.length ; i ++) {
			so[ s2[i]][0] = String.valueOf(s1[i]);
			so[s2[i]][1] = s1[i][1];
		}
		
	}

}
