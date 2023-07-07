package am;

public class TryExam3 {

	public static void main(String[] args) {
		
		try {
		String str = null;
	//	System.out.println(str.length());
		int result = 10/0;
		}catch(NullPointerException | ArithmeticException e){
			System.out.println("null 참조: " + e.getMessage());
		}
	}
}


