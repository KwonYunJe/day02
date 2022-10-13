package day02;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch121 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] x = {"boolean", "byte", "double", "floatint", "long", " short"};
		double[] f = {10.1, 12.3, 15.4, 19.1};
		char[] c = {'a', 'b', 'c', 'd', 'e'};
		
		System.out.println("Hope find str?");
		String k = sc.next();
		
		int idx = Arrays.binarySearch(x, k);
		if(idx < -1) {
			System.out.println("Can't find index");
		}else {
			System.out.println("The index in x[" + idx + "]");
		}
		
		System.out.println("Hope find str?");
		double ff = sc.nextDouble();
		
		int idx2 = Arrays.binarySearch(f, ff);
		if(idx2 < -1) {
			System.out.println("Can't find index");
		}else {
			System.out.println("The index in x[" + idx2 + "]");
		}
		
	}

}
