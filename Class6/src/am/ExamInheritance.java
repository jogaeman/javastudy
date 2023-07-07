package am;

public class ExamInheritance {

	public static void main(String[] args) {
		
		ECar ecar = new ECar();
		
		ecar.drive(); // 부모 클래스의 메서드 사

	}

}

class Car{
	void drive() {
		System.out.println("The car is driving");
	}
}

class ECar extends Car{
	
	
}