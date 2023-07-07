package jump;

public class Croc extends Animal implements Predator,Barkable{

	
	public String getFood() {
		return "Cherry";
	}

	@Override
	public void bark() {
		System.out.println("냠냠쩝쩝");
		
	}
}