package iterator;

import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// 반복자(Iterator)
		// 인터페이스로 컬렉션 요소를 순회하여 하나씩 추출하는데 사용한다

		// Iteraor의 메서드
		// boolean hasNext() : 컬랙션을 순회하면서 다음 요소가 있는지 검증
		// E next() :컬랙션을 순회하면서 요소를 하나씩 꺼낸다
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		list.iterator();
		
		Iterator<Integer> iter = list.iterator();
	      
	      int count = 0;
	      
	      while(iter.hasNext()) {
	         int val  = iter.next();
	         System.out.printf("list 데이터[%d] : %d\n",count++,val);
	      }
	      
	      Set<Integer> set = new HashSet<Integer>();
	      
	      for(int i = 0; i <= 10; i++) {
	         set.add(i);
	         
	      Iterator<Integer> iter2 = set.iterator();
	      count = 0;
	      while(iter2.hasNext()) {
	         int val = iter2.next();
	         System.out.printf("set 데이터[%d] : %d\n",count++,val);
	      }
	      }
	}

}
