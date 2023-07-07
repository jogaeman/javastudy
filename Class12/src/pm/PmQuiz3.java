package pm;

import java.util.Scanner;

public class PmQuiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] numbers = {1,2,3,4,5};
		
		try {
		System.out.print("인덱스를 입력하세요: ");
		int i = sc.nextInt();
		System.out.println("해당요소:  " + numbers[i]);
		}catch(Exception e) {
			System.out.println("잘못된 인덱스 입니다.");
		}
	}

}
