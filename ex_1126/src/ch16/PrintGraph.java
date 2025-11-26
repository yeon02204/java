package ch16;

import java.util.Arrays;
import java.util.Random;

public class PrintGraph {
	
//	Graph클래스를 만들고 main()메서드를 갖는다.
//	0~9사이의 난수를 100개 저장하는 배열을 만들고,
//	해당 배열이 가지고 있는 0 ~9사이의 난수가 몇개씩 있는지 판별하고
//	그래프화 한다.
//	발생한 난수의 그래프화 작업은 PrintGraph클래스에서 print메서드를
//	만들어서 작업한다.
	
	public void print() {
		
		int[] arr = new int[100];// 난수들을 담을 배열

		for(int i = 0;i < arr.length; i++) {
			Random random = new Random();
			int n = random.nextInt(10);
			arr[i] = n;
		}

		int[] count = new int[10]; // 난수가 몇개씩 나왔는지 담을 배열
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        
        for(int i = 0; i < count.length; i++) {
            System.out.print(i + " : ");
            for(int j = 0; j < count[i]; j++) {
                System.out.print("#" );
            }
            System.out.println(count[i]);
        }
    
			
		
		
	}// print

}// class
