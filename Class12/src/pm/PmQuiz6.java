package pm;
import java.util.Scanner;

public class PmQuiz6 {
	
	  public static void main(String[] args) {
	    
	  Scanner scanner = new Scanner (System.in);
	     System.out.println("점수를 입력하세요");
	     int num = scanner.nextInt();

	  try {
		  
	  if (num > 0 && num <100)
	    throw new IllegalArgumentException("잘못된 점수 입니다");
	    
	  }catch(Exception e) {
		  System.out.println(e.toString());
	  }
	    }
	}

