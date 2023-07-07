package day1;

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
 
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        if(A==B && A==C && B==C){ //A=3   B=3   C=3
        	System.out.println(10000 + A*1000);
        	
        }else if (A==B && A!=C && B!=C ) { //A=3   B=3   C=2
        	System.out.println(1000 + A*100);
        }else if(A!=B && A==C && B!=C) { //A=3   B=2   C=3
        	System.out.println(1000 + A*100);
        }else if(A!=B && A!=C && B==C) {//A=2   B=3   C=3
        	System.out.println(1000 + B*100);
        }else {
        	if(A>B && A>C) {
        		System.out.println(A*100);
        	}else if(A<B && B > C) {
        		System.out.println(B*100);
        	} else {
        		System.out.println(C*100);
        	}
        }
    }
}

