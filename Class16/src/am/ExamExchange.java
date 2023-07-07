package am;

import java.util.Scanner;

public class ExamExchange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 개의 배열을 생성할까요?");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		int max = arr[0];
		
	for (int i = 0; i < arr.length; i++) {
		System.out.println((i+1) + "번째 배열의 값을 입력하세요 : ");
		arr[i] = sc.nextInt();
		
		if(arr[i] > max) {
			max = arr[i];
		
			
		}
		
	}
		System.out.println(max);
	}

}
