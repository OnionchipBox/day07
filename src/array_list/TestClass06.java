package array_list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestClass06 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("1111");
		arr.add("2222");
		arr.add("3333");
		
		Iterator<String> it = arr.iterator(); //반복자
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		System.out.println("it hasNext() : "+it.hasNext()); //다음줄에 데이터가 없어서 false
//		System.out.println(it.next()); // 한계까지 next를 해서 에러뜸
		
//		System.out.println(it.hasNext()); //값이 있으면 true, 없으면 false
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.hasNext()); //4번째 데이터가 없으니 false
		
		System.out.println("=== HashSet ===");
		
		HashSet<String> hs = new HashSet<>();
		hs.add("1111");
		hs.add("222");
		hs.add("33");
		hs.add("으어어어어어");
		System.out.println(hs);
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext()) {
			String n = i.next();
			System.out.println(n);
		}
		System.out.println("i hasNext() : "+i.hasNext());
	}

}
