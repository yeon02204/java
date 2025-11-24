package ch_06;
import java.util.Random;
import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		// while 조건식 {
		// 조건식이 참일때 반복할 명령
		// }
		
		// 주의사항
		// while문에는 초기식과 증감식이 따로 존재하지 않기 때문에 직접 작성을 해줘야 한다
		
		int i = 1;
		while (i <= 10){
			System.out.print(i + " ");
			i++;
			
		}
		
		System.out.println(" ");
		System.out.println("------------------------");
		
		// 내가 정확히 몇번을 반복해야할지 모를때
		// while문 작성
		Scanner sc = new Scanner(System.in);
		// 랜덤 숫자
		int random = new Random().nextInt(50)+1;
		
		int answer = 0;
		while (answer != random){
			System.out.print("숫자 입력 : ");
			answer = sc.nextInt();
			if(answer > random){
				System.out.println("down");
			}else if(answer < random){
				System.out.println("up");
			}
		}
		
		System.out.println("정답입니다~~!");
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // 메인
} // 클래스
