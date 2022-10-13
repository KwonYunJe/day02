package day02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ObjectBinarySearch {

	public static void main(String[] args) {
		//1.Student 클래스를 개체화하여 배열에 담는다 
		Student[] sArr = { new Student("강민하", 162, 0.3), 
							new Student("이수연", 172, 0.5), 
							new Student("황지인", 156, 1.0), 
							new Student("김찬우", 173, 1.2)};
		System.out.println(sArr[0]);
		
		//2. 검색할 키값을 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter to find word");
		int key = sc.nextInt();
		//int idx = Arrays.binarySearch(sArr, key);
		int idx = Arrays.binarySearch(sArr, new Student("", key, 0.0) , Student.HEIGHT_ORDER);
		if(idx < 0) {
			System.out.println(key + "Not found");
		}else {
			System.out.println("Index in " + idx);
			System.out.println("Found data in " + sArr[idx]);
		}
	}

}

class Student {
	String name;
	int height;
	double vision;
	
	public Student(String name, int height, double vision) {
		super();
		this.name = name;
		this.height = height;
		this.vision = vision;
	}
	
	public String toString() {
		return name + " " + height + " " + vision;
	}
	//상수처리
	public static final Comparator<Student> HEIGHT_ORDER = new HeightComparator();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getVision() {
		return vision;
	}

	public void setVision(double vision) {
		this.vision = vision;
	}
	
}

class HeightComparator implements Comparator<Student>{
	public int compare(Student o1, Student o2) {
		System.out.println("This is setting standard for Sorting");
		//return (o1.height > o2.height) ? 1 : (o1.height == o2.height) ? 0 : -1;
		return (o1.height - o2.height);
	}
}