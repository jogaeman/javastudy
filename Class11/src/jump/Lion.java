package jump;

public class Lion extends Animal implements Predator,Barkable{

	
	public String getFood() {
		return "Banana";
	}

	@Override
	public void bark() {
	System.out.println("어흥");
		
	}
}
