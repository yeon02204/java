package ch_09;

public class ArrayExample {

	public static void main(String[] args) {
		String[] season = {"Spring","Summer","Fall","Winter"};
		
		// 배열의 요소에 접근하는법
		// 변수명[index] -> 변수처럼 사용하자!!!
		// season[0] -> "Spring"이 들어있음
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		
		// 인덱스 1번의 요소의 값을 변경
		// "여름"
		season[1] = "여름";
		System.out.println(season[1]);
		
		// 총합과 평균 구하기 
		int[] score = {83,90,87};
		
		int sumScore = score[0] + score[1] + score[2];
		System.out.println("총합 : " + sumScore);
		int avgScore = sumScore / 3;
		System.out.println("평균 : " + avgScore);
		
		System.out.println("-----------------------------");
		
		int sumScore2 = 0;
		int avgScore2 = 0;
		for(int i = 0; i < score.length; i++) {
			sumScore2 += score[i];
		}
		avgScore2 = sumScore2 / score.length;
		
		System.out.println("총합 : " + sumScore2);
		System.out.println("평균 : " + avgScore2);
		
		System.out.println("-----------------------------");
		
		int[] arr = { 7, 14, 23, 38, 41, 56, 63, 72, 89, 100 };
		// 짝수의 갯수와 홀수의 갯수를 출력하세요
		
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0){
				evenCount++;
			}else {
				oddCount++;
			}
		}
		System.out.println("짝수 : " + evenCount);
		System.out.println("홀수 : " + oddCount);
		

	}

}
