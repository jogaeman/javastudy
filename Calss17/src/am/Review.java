package am;

import java.util.Scanner;

public class Review {
	
	
	//키보드로 입력 받는 메서드
	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3];

		for (int i = 0; i < numbers.length; i++) {
			
			System.out.println("숫자를 입력하세요");
			numbers[i] = sc.nextInt();
		}
		return numbers;
	}
	
	//최솟값 찾는 메서드 
	public static int min(int[] numbers) {
		int min = 0;
		if (numbers[0] <= numbers[1] && numbers[0] <= numbers[2]) {
            min = numbers[0];
        } else if (numbers[1] <= numbers[0] && numbers[1] <= numbers[2]) {
            min = numbers[1];
        } else {
            min = numbers[2];
        }
        System.out.println("가장 작은 수는 " + min + "입니다.");
        
		return i;
	}

	public static void main(String[] args) {
		int[] arr = input();
		int num = min(arr);
		
		System.out.println("최솟값은 : " + num + " 입니다.");
		
		
	}

}
