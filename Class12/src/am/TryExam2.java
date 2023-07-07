package am;

public class TryExam2 {

	public static void main(String[] args) {
		
		try {
		String str = null;
	//	System.out.println(str.length());
		int result = 10/0;
		}catch(NullPointerException e){
			System.out.println("null 참조: " + e.getMessage());
		}catch(ArithmeticException e){
			System.out.println("산술 오류: " + e.getMessage());
		}
	}
}

