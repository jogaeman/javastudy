package pm;

public class ExamStstic {

	public static void main(String[] args) {


		Cat cat = new Cat();
		cat.bark();
		Croc.bark();
	}

}

class Cat{
	void bark() {
	System.out.println("Meeu!");
}
}

class Croc{
	static void bark() {
	System.out.println("Peeu!");
}
}