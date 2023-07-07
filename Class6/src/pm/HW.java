package pm;

public class HW {

	public static void main(String[] args) {
		
	Person person = new Person();
	person.introduce("Hello, my name is Austin and i'm 21 years old.");
	System.out.println(person.getIntroduce());
	
	}

}

class Person{
	
	private String str;

	public String getIntroduce() {
		return str;
	}

	public void introduce(String str) {
		this.str = str;
	}
}package HW;


public class HW {

	public static void main(String[] args) {
		
	Person person = new Person();
	person.introduce("Hello, my name is Austin and i'm 21 years old.");
	System.out.println(person.getIntroduce());
	
	}

}

class Person{
	
	private String str;

	public String getIntroduce() {
		return str;
	}

	public void introduce(String str) {
		this.str = str;
	}
}
	