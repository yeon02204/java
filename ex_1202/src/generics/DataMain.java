package generics;

public class DataMain {
	public static void main(String[] args) {

		// 객체를 만드는 시점에 타입을 결정한다
		// 제네릭 타입은 기본 자료형을 인식하지 않는다
		// int , double등의 기본 자료형을 제네릭 타입으로 이용하고자 할 떄는
		// Integer,Double등의 클래스를 이용해야한다
		DataList<Integer> list = new DataList<Integer>();
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);

		// list.add("문자열");
		// list.add(3.14);

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);

			// 저장된 데이터 타입이 어떤 타입인지 검사
//			if(data instanceof Integer) {
//				System.out.println("정수 : " + (int)data);
//			}else if (data instanceof Double) {
//				System.out.println("실수 : " + (double)data);
//			}else if (data instanceof String) {
//				System.out.println("문자열 : " + (String)data);
//			}

		}
		System.out.println("총합:" + sum);
		// 저장 데이터의 타입이 오브젝트 리기 때문에 어떤 타입의 데이터라도 저장 할 수 있다
		// 데이터를 사용하기 위해서는 타입변환을 위해 검사를 해야 하는 번거로움이 있다
	}
}
