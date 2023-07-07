package am;

public class ExamOOP {

	public static void main(String[] args) {
		
		Car myCar = new Car(); // Car 클래스로 myCar 객체 생성
		Car yourCar = new Car(); // Car 클래스로 yourCar 객체 생
		
		Board board = new Board(); //게시물 생
	}
}

class Board{
	String title; 	// 게시물 제목
	String content; // 게시물 내용
	String name; // 게시물 작성자
}

class Car {
	
	//변수
	String color;
	String name;
	
	// 매서드 동작
	void drive() {
		System.out.println("The car is driveing");
	}
}
