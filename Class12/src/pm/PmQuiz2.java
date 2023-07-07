package pm;

import java.util.Scanner;

public class PmQuiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
		System.out.print("나이를 입력하세요: " );
		int i = sc.nextInt();
			if(i >= 18)System.out.println("성인입니다");
			else if (i < 0) throw new IllegalArgumentException("잘못된 나이입니다.");
			else System.out.println("미성년자 입니다");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
