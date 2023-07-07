package am;

public class BinarySearch {
	
	public static int search () {
		int[] arr = {1,2,10,12,17,14,19};
		int head = 0 ;
		int tail = 6 ;
		int center = 0;
	
	while(head <= tail){
		center = (head+tail)/2;
		if(arr[center]==17){
			System.out.println(center + "번째 요소에 있습니다.");
			break;
		}
		if (arr[center] < 17){
			head= center + 1;
			
		}else {
			tail = center - 1 ;
		}
		
	}
	System.out.println("값을 찾지 못했습니다.");
	return center;
	
	}
	
	

	public static void main(String[] args) {
		
		int num = search();
		System.out.println(num);
		
		
	}

}
