package pm;

public class array {
	

	 public static void main(String[] args) {

	        // int 배열
	        int[] arr = { 1, 2, 3, 4, 5 };

	        // 합계 계산
	        int sum = 0;
	        for (int num : arr) {
	            sum += num;
	        }

	        // 결과 출력
	        System.out.println(sum);  // 15
	    }
	}