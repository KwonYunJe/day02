package day02;

public class IdTester119 {
	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		
		a.getId();
		b.getId();
		
	}
}

class Id{
	private static int counter = 0; //정적(클래스)변수 선언 컴파일하자마자 바로 메모리에 적재
	private int id; //인스턴스(객체)변수 new로 인스턴스화한 후에 힙 메모리에 적재 
	
	{System.out.println("Block part");}
	
	public Id() {
		id = ++counter;
		//System.out.println("생성자 part");
	}
	public static int getCounter() {return counter;}	//정적 메소드
	public int getId() {
		
		return id;}
}