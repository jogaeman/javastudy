package am;

// ArrayList를 사용하려면 import 해야만한다.
import java.util.ArrayList;

public class ExamArrayList {

	public static void main(String[] args) {
		
//		// 배열 생성
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//
//		// 배열 초기화가 필요없다.
//		numbers.add(1);
//		numbers.add(2);
//		numbers.add(3);
//		
//		// 배열 요소에 접근
//		int num = numbers.get(0);
//		
//		// 배열의 현재 크기 확인
//		System.out.println(numbers.size());
//		
//		//배열의 요소 제거 후 배열의 크기 확인
//		numbers.remove(2); //2번 인덱스의 값 제거
//		System.out.println(numbers.size());
			
	 int[] score = new int[3];
	 
	 		 score[0] = 70;
			 score[1] = 80;
			 score[2] = 90;
			 
			 for (int i = 2; i >= 0; i--) {
				 System.out.println(score[i]);
				
			}
	 
		
		
	}

}
