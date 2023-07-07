package pm;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 ");
		int b = sc.nextInt();
		System.out.print("세번째 숫자를 입력하세요 ");
		int c = sc.nextInt();
		System.out.print ("네번째 숫자를 입력하세요 ");
		int d = sc.nextInt();
		System.out.print("다섯번째 숫자를 입력하세요 ");
		int e = sc.nextInt();
		
		
		
		int[] arrs = {a,b,c,d,e};
		int sum = 0;
		for (int i : arrs) {
		 sum += i;
			
		}
		System.out.println("총합은" + sum + "입니다");
	}

}

