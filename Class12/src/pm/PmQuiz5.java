package pm;

import java.util.Scanner;

public class PmQuiz5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer max;
		System.out.print("첫번째 숫자를 입력하세요: " );
		Integer i = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요: " );
		Integer j = sc.nextInt();
		System.out.print("세번째 숫자를 입력하세요: " );
		Integer z = sc.nextInt();
		
		try {
			
			
			max = Math.max(i, Math.max(j, z));
	        System.out.println("가장 큰 수는 " + max + "입니다.");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
