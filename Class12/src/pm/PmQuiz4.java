package pm;

import java.util.Scanner;

public class PmQuiz4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		try {
			System.out.print("숫자를 입력하세요 ");
			int i = scanner.nextInt();
			System.out.print("두번째 숫자를 입력하세요.");
			int j = scanner.nextInt();
			int result = i / j;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
	}

}
