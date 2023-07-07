package pm;

import java.util.Scanner;

public class WhatOr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요");
		int i = sc.nextInt();
		System.out.println("두번째 수를 입력하세요");
		int j = sc.nextInt();
		
		if(i>j) {
			System.out.println(i + " 가 더 큽니다");
		} else if (i<j){
			System.out.println(j + " 가 더 큽니다");
		} else {
			System.out.println("두 수가 같습니다");
		}
		
		

	}

}
