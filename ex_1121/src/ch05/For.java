package ch05;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// 1~10 출력 (가로로 : 1 2 3 4 5 6 7 8 9 10)

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}

		System.out.println(" ");// 줄바꿈

		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}

		System.out.println(" ");// 줄바꿈

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println(" ");// 줄바꿈

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.print("합계 : " + sum);

		System.out.println(" ");// 줄바꿈

		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요 :");
		int dan = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			int add = (dan * i);
			System.out.printf("%d X %d = %d", dan, i, add);
			System.out.println(" ");// 줄바꿈
		}

		System.out.print("정수 1을 입력하세요 :");
		int x = sc.nextInt();
		System.out.print("정수 2을 입력하세요 :");
		int y = sc.nextInt();
		int sum2 = 0;
		int sum3 = 0;

		if (x > y){
			for (int i = y; i <= x; i++) {
				sum2 += i;
			}
			System.out.print("합계 : " + sum2);
		} else if(x < y){
			for (int i = x; i <= y; i++) {
				sum3 += i;
		}
			System.out.print("합계 : " + sum3);
		}else {
			System.out.print("두 수가 같습니다.");
		}
		
		System.out.println(" ");// 줄바꿈
		
		int sum4 = 0;
		for(int i = 1; i <= 20; i++) {
			if(i % 2 != 0 && i % 3 != 0) {
				sum4 += i;
			}	
		}
		System.out.print("총합 : "+ sum4);
		System.out.println(" ");// 줄바꿈
		
		int num = 12345; // 초기값
        int total = 0;

        while (num > 0) {
            total += num % 10; // 마지막 자리
            num = num / 10; // 한 자리 제거
        }
        System.out.print("총합2 : "+ total);
        System.out.println(" ");// 줄바꿈
        
        int sum5 = 0;
        int total1 = 0;
        for (int i = 1; i <= 10; i++) {
			sum5 += i;
			total1 += sum5;
		}
        System.out.print("총합3 : "+ total1);
        System.out.println(" ");// 줄바꿈
	} // main

	}// class
