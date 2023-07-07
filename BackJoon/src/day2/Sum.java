package day2;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		
		for (int i = 1; i <= n; i++) {
			
	         result += i;
			
		}
		System.out.println(result);
		

	}

}



//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ans = 0;
//        for (int i = 1; i <= n; i++) {
//            ans += i;
//        }
//        System.out.println(ans);
//    }
//}
