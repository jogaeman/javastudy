package jump;

public class Tiger extends Animal implements Predator,Barkable{

	public String getFood() {
		return "Apple";
	}

	@Override
	public void bark() {
		System.out.println("어흥");
		
	}
}
