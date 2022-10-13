package day02;

import java.util.Scanner;

public class SeqSearch {
	
	private static int seqSearch(int[] a, int num, int ky) {
		int re = 0;
		for(int i = 0; i < num; i++) {
			if(i==num) {
				re = -1;
			}else if(a[i]==ky) {
				re = i;
			}
		}
		return re;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("요소수");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		System.out.println("검색할 값: ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearch(x, num, ky);
		if(idx == -1) {
			System.out.println("Not found");
		}else {
			System.out.println("Result in x[" + idx + "]");
		}
	}
	
	

	
}
