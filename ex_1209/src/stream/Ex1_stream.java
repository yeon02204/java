package stream;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex1_stream {
	public static void main(String[] args) {
		List<String> names = List.of("철수", "영희", "민수");

		// 스트림의 생성
		Stream<String> s_nameStream = names.stream();

		// forEach() - 각 요소에 대해 작업을 수행하는 최종연산

		// 중간연산(내가 원하는걸로 가공)
		List<Integer> nums = List.of(5, 1, 4, 2, 3, 6, 9, 8, 7, 6, 6, 5, 5, 1, 2, 1, 3, 3);

		// filter - 조건에 맞는것만 남기는 중간연산
		nums.stream().filter(x -> x % 2 == 0)// 짝수만
				.forEach(System.out::print);
		System.out.println(""); // 4268662
		System.out.println("---------------------");

		// map - 요소에 처리를 해주는 중간연산
		names.stream().map(x -> x + "님").forEach(System.out::print);
		System.out.println("");// 철수님영희님민수님
		System.out.println("---------------------");

		// sorted - 정렬 (오름차순)
		nums.stream().sorted().forEach(System.out::print);
		System.out.println(""); // 111223334555666789
		System.out.println("---------------------");

		// 내림차순
		nums.stream().sorted((a, b) -> b - a).forEach(System.out::print);
		System.out.println("");// 987666555433322111
		System.out.println("---------------------");

		// distinct - 중복제거
		nums.stream().distinct().forEach(System.out::print);
		System.out.println("");// 514236987
		System.out.println("---------------------");

		// limit/skip - 일부만 잘라 쓰는 중간 연산

		nums.stream().limit(3) // 앞에서부터 3개만
				.forEach(System.out::print);
		System.out.println(""); //514
		System.out.println("---------------------");

		nums.stream().skip(3) // 앞에 3개를 자르고 나머지 출력
				.forEach(System.out::print); // 236987665512133
		System.out.println("");
		System.out.println("---------------------");

		// 스트림으로 가공한 결과를 List,Set 같은 컬랙션으로 다시 만들고 싶으면
		// Collection(Collectors...)를 사용한다

		List<Integer> evenList = nums.stream().filter(x -> x % 2 == 0)
											.distinct()
											.sorted()
											.collect(Collectors.toList()); 
		// 결과를 List로 만들어서 반환
		
		// Collectors에 들어있는 메서드
		// toList() : 리스트로 반환 
		// toSet() : set으로 반환
		// joining(" , ") : 문자열들을 하나로 합치기
		// groupingBy(...) : 특정 기준으로 그룹 나누기
		
		
		List<String> items = List.of("A","B","A","C");
		
		Set<String> set = items.stream()
							.collect(Collectors.toSet());
		System.out.println(set); // [A, B, C]
		System.out.println("---------------------");
		

		List<String> words = List.of("Java","Spring","React");
		
		String joined = words.stream()
									.collect(Collectors.joining(" , "));
		System.out.println(joined); // Java, Spring, React
		System.out.println("---------------------");
		
		List<String> names2 = List.of("Lee","Park","Kim","Choi","Jin");
		
		Map<Integer, List<String>> grouped = 
				names2.stream()
					.collect(Collectors.groupingBy(name-> name.length()));
		System.out.println(grouped); // {3=[Lee, Kim, Jin], 4=[Park, Choi]}
		System.out.println("---------------------");
		
		// count - 갯수세기
		long count = nums.stream()
					.filter(x -> x % 2 == 0)
					.count();
		System.out.println(count); // 7
		System.out.println("---------------------");
		
		// 조건 만족 여부 검사
		List<Integer> nums2 = List.of(1,2,3,4,5);
		// 결과를 boolean으로 반환
		// anyMatch - 하나라도 만족하면 true을 반환
		boolean hasEven = nums2.stream().anyMatch(x -> x % 2 == 0);
		
		System.out.println("hasEven :"+hasEven); // true
		System.out.println("---------------------");
		
		// allMatch - 요소들이 모두 조건을 만족하는가
		boolean allPositive = nums2.stream().allMatch(x -> x > 0);
		System.out.println("allPositive :"+allPositive); // true
		System.out.println("---------------------");
		
		// noneMatch - 요소들이 모두 조건을 만족하지 않으면 참
		boolean noneNegative  = nums2.stream().noneMatch(x -> x < 0);
		System.out.println("noneNegative :" + noneNegative); // true
		
		// 하나만 찾기
		// findFirst
		Optional<String> result = names.stream()
											.filter(s -> s.startsWith("영"))
											.findFirst();
		result.ifPresent(System.out::print);
		System.out.println(" ");
		System.out.println("---------------------");
		
		//findAny - 스트림 요소에서 아무거나 반환
		Optional<String> anyName = names.stream()
				.filter(x -> x.length() == 2)
				.findAny();
		anyName.ifPresent(System.out:: println);
		// 무엇이 나올지는 보장이 안된다
		
	}
}
