package am;

import java.util.Scanner;

public class Quiz1 {

    public static void main(String[] args){
    	 
        
    Scanner sc = new Scanner(System.in);
    int[] numbers = new int[3];
	int size = numbers.length;
	int min;

	for (int i = 0; i < size; i++) {
		
		System.out.println("숫자를 입력하세요");
		numbers[i] = sc.nextInt();
	}
       
  

       
        
        if (numbers[0] <= numbers[1] && numbers[0] <= numbers[2]) {
            min = numbers[0];
        } else if (numbers[1] <= numbers[0] && numbers[1] <= numbers[2]) {
            min = numbers[1];
        } else {
            min = numbers[2];
        }
        System.out.println("가장 작은 수는 " + min + "입니다.");
        
       
   
    }

}
