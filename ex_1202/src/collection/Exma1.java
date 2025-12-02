package collection;

import java.util.ArrayList;

public class Exma1 {

	public static void main(String[] args) {
		// 정수타입의 ArrayList를 생성합니다
		// 1 ~ 30 사이의 난수를 10개 넣는다

		// 그 중에 짝수만 출력하기

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 30) + 1;
			list.add(num);
		}
		System.out.println(list);

		System.out.print("짝수 :");
		for (int i = 0; i < list.size(); i++) {
			int value = list.get(i);
			if (value % 2 == 0) {
				System.out.print(value + " ");

			}
		}
	}

}
