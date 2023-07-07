package am;

public class ExamInherit {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		bus.run();
		bus.ppangppang();
		Car4 car = new Car4();
		car.run();

	}

}


class Car4{
	public void run() {
		System.out.println("달린다.");
	}
	
}

class Bus extends Car4{
	public void ppangppang() {
		System.out.println("빵빵");
	}
	
}