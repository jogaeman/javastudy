package am;

public class ExamCar {

	public static void main(String[] args) {
		Truck truck = new Truck();
		Van van = new Van();
		Car[] array = {truck, van};

	}

}

class Car{
	
	Car(){
		
	}
	
	Car(String name){
		System.out.println("부모의 기본생성자");
	}
	public void run() {
		System.out.println("Car의run");
	}
}

class Van extends Car{
	public void run() {
		super.run();
		System.out.println("Van의 run");
	}
}
class Truck extends Car{
	Truck(){
		
		System.out.println("자식의 기본생성");
	}
	
}
