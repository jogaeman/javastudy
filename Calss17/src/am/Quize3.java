package am;

import java.util.Arrays;

public class Quize3 {
	public static int search(int[] arr){
	int tail = 6;
	int head = 0;
	int center;
	
	while (head <= tail) {
		center = (head + tail) /2;
		
		if (arr[center]==17) {
			return center;
			
		}
		if (arr[center] < 17) {
			head = center + 1;
		}else {
			tail = center - 1;
		}
	}
	return -1;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {11, 13,19,17, 20, 21, 23}; //length(7)
		Arrays.sort(arr);
		int result = search(arr);
		if(result == -1) {
			System.out.println("찾지 못했습니다.");
		} else {
			System.out.println(result + " 번째 요소에 있습니다.");
		}
		

	}

}
