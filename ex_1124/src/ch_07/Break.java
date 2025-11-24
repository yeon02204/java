package ch_07;

import java.util.Random;
import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		// break
		// 반복문을 의도적으로 종료 할 때 사용하는 키워드
		
		
		
		while(true) {
			int random = new Random().nextInt(10)+1;
			System.out.println(random);
			if(random == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		// 난수 생성해서 맞추는 up, down 퀴즈 프로그램
		// 기회를 10번만 주기
		
		// 1. 1 ~ 50 사이의 난수 생성하기
		int ran = new Random().nextInt(50)+1;
		Scanner sc = new Scanner(System.in);
		// 2. for문을 이용해서 up,down 퀴즈 프로그램 만들기
		// 정답이 난수보다 크면 down
		// 정답이 난수보다 작으면 up 출력
		// 정답을 맞추면 반복문 종료
		// 기회는 10번
		int answer = 0;
		// 정답을 맞췄는지 여부에 대한 정보를 
		
		boolean isMatched = false;
		for(int i = 0; i < 10; i++) {
			System.out.print("숫자 입력 : ");
			answer = sc.nextInt();
			
			if(answer == ran) {
				System.out.println((i + 1)+"번째에 맞췄습니다");
				isMatched = true;
				break;
			}else if(answer > ran){
				System.out.println("down");
			}else if(answer < ran){
				System.out.println("up");
			}
		}
		if(!isMatched) {
			System.out.println("정답을 맞추지 못했습니다");
		}
		
		System.out.println("------------------------");
		
		// 중첩 반복문에서 break;
		// break 문은 가까운 반복문을 종료하고 outer 반복문은 종료시키지 않는다 
		// 중첩된 반복문에서 바깥쪽 반복문 까지 종료 시키려면 outer 반복문에 라벨을 붙이고
		//break 쪽에도 라벨을 단다
		
		Outter:for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	} // 메인
} // 클래스
