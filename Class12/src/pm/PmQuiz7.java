package pm;
import java.util.Scanner;

public class PmQuiz7 {
	
	  public static void main(String[] args) {
	    
	  Scanner scanner = new Scanner (System.in);
	     System.out.println("숫자를 입력하세요");
	     int num = scanner.nextInt();
	     int facto = 0;
	     try {
		 for(int i=1; i<=num; i++) {
		 facto *= i;
		 }
	  
		 System.out.println(facto);
	    
	  }catch(Exception e) {
		  System.out.println(e.toString());
	  }
	    }
}
	


