package day02;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		int[] src = {6,4,3,2,1,9,8};
		int find = 0;
		int found = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number for find");
		find = sc.nextInt();
		
		System.out.print("   |");
		for(int i = 0 ; i < src.length ; i++) {
			System.out.print(" " + i + " ");
		}
		System.out.println();
		System.out.print("___");
		for(int i = 0 ; i < src.length ; i++) {
			System.out.print("___");
		}
		
		System.out.println();
		//System.out.print("   |");
		
		for(int i = 0 ; i < src.length ; i++) {
			System.out.print("   |");
			for(int j = 0 ; j < src.length ; j++) {
				if(j!=i) {
					System.out.print("   ");
				}else if (j==i) {
					System.out.print(" * ");
				}
				
			}
			System.out.println();
			System.out.print("  " + i + "|");
			for(int j = 0 ; j < src.length ; j++) {
				System.out.print(" " + src[j] + " ");
			}
			System.out.println();
			if(src[i] == find) {
				found = i;
				System.out.println("The result in src[" + found + "]");
				break;
			}
		}
	}

}
