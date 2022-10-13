package day02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ObjectBinarySearch02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] pArr = {new Person(10, "홍"), new Person(20, "김"),
				new Person(27, "최"), new Person(25, "이")};
		
		int idx = Arrays.binarySearch(pArr, new Person(20,""), Person.AGE_ORDER);
		System.out.println(idx);
	}
}


class Person {
	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + age;
	}
	public static final Comparator<Person> AGE_ORDER = new AgeComparator();
}


class AgeComparator implements Comparator<Person>{
	public int compare(Person o1, Person o2) {
		return o1.age - o2.age;
	};
}