package day02;

public class LinearSearchEx01 {

	public static void main(String[] args) {
		int[] a = {6,4,3,2,1,2,8};	//배열 생성 및 초기화 
		int key = 2;	//검색할 값
		boolean flag = false;
		
		for(int i  = 0 ; i < a.length ; i++) {
			if(a[i] == key) {
				System.out.println("Found");
			}
		}
		if(!flag) {
			System.out.println("Not found");
		}
	}

}
