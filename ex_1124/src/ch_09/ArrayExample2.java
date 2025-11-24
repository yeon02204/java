package ch_09;

import java.util.Random;

public class ArrayExample2 {

	public static void main(String[] args) {
		// 길이가 3인 비어있는 정수형 배열을 생성
		int[] arr = new int[3];
		System.out.println(arr);
		
		for(int i= 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d\n",i,arr[i]);
		}
		
		String[] sArr = new String[3];
		for(int i= 0; i < sArr.length; i++) {
			System.out.printf("arr[%s] : %s\n",i,arr[i]);
		}

		// 배열의 길이
		// 배열을 생성했을때 대괄호안에 배열의 길이를 작성했다
		// 배열은 내부적으로 length 라는 변수를 지니는데, 해당 변수는 배열의 길이값을 가지고 있다
		// 배열의 길이를 알고싶을때는 배열명 .length를 하면 된다.
		
		// 길이 10의 정수형 배열을 만든다
		// 배열 이름은 numbers
		
		// 배열의 10개의 난수를 집어넣는다 (1~30)
		
		// 배열안에서 모든 짝수의 합 구하기
		
		int[] numbers = new int[10];
		
		int sum = 0;
		for(int i= 0; i < numbers.length; i++) {
			int random = new Random().nextInt(30)+1;
			System.out.println("랜덤숫자 :"+random);
			numbers[i] = random;  
			if(numbers[i] % 2 == 0) {
				sum += numbers[i];
			}
		}
		
		System.out.println("짝수 총합 :"+sum);
		//정렬
	    //배열의 값이 순서 없이 저장되는 경우, 배열의 값을 오름차순으로 정렬해주세요
		
		int[] arr2 = {1,6,2,10,5,8,4,3,9,7};
		
		int temp = 0;
		for(int i = arr2.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if (arr2[j] > arr2[j + 1]) {
				    temp = arr2[j];
				    arr2[j] = arr2[j + 1];
				    arr2[j + 1] = temp;
				}
			}
		}
		
		System.out.println("정렬 후 출력 : ");
		for(int i = 0 ; i < arr2.length; i++) {
		System.out.print(arr2[i] + " ");
		}
		
	}

}
