package array_list;

/*
	컬렉션 프레임워크(collection framework)
	- 데이터들을 편리하게 사용할 수 있게 만든 기능
	- 표준화된 클래스를 이용한다
	Collection
	- 다수의 데이터들을 의미한다
	- 무한한 데이터의 집합
	Framework
	- 디자인 패턴
	- 표준화된 프로그래밍 방식
	컬렉션 프레임웍의 핵심 인터페이스
	- List, Set, Map
	
	List -> ArrayList
	- 순서가 있는 데이터의 집합
	- 순서가 존재해서 index를 사용할 수 있다
	- 데이터의 중복이 가능하다
	
	처리속도는 배열이 더 빠르다
*/

import java.util.ArrayList;

public class TestClass01 {
	public static void main(String[] args) {
	
	ArrayList<String> arr = new ArrayList<>();
	
	System.out.println(arr.size()); //현재 저장된 데이터가 없어서 0
	
	arr.add("1111"); //add - 데이터 추가
	arr.add("2222");
	
	System.out.println(arr.size()); //("1111","2222") 두개의 저장된 값
	System.out.println(arr.get(0)); //"1111"값 출력
	System.out.println(arr.get(1)); //"2222"값 출력
	
	System.out.println(arr.contains("2222")); //"2222"값이 있기 때문에 true
	System.out.println(arr.contains("1212")); //"1212"값이 없기 때문에 false
	
	boolean bool = arr.contains("1111");
	System.out.println("arr에 1111 : "+bool);
	
	System.out.println("==== arr ====");
	System.out.println("현재 저장된 arr : "+arr);
	//arr.remove("1111"); //"1111"값 삭제
	arr.remove(0); //"1111"값 삭제
	System.out.println("1111 삭제 후 arr : "+arr);
	System.out.println("2222 확인 : "+arr.get(0));
	
	
	
		
		
		
		
		
	}

}
