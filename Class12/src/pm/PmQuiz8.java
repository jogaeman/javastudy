package pm;

import java.util.Scanner;

public class PmQuiz8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int i = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int j = sc.nextInt();
		
		
		
		
		try {
			int result = i/j;
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

}
}

