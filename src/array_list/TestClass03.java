package array_list;

import java.util.ArrayList;

public class TestClass03 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("1111");
		arr.add("2222");
		arr.add("3333");
		arr.add("4444");
		System.out.println(arr);
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(i+". "+arr.get(i));
		}
		
		System.out.println("==== for eatch ====");
		
		for(String str : arr) { 
			System.out.println(str);
		}
		
		
		
		
	}

}
