package arraylist;

import java.util.ArrayList;

public class AddAll {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("A");
		arr.add(arr.size(), "B");
		
		arr.forEach(System.out::println);
		System.out.println();
		
		arr.addAll(arr);
		
		arr.forEach(System.out::println);
		System.out.println();
		
		arr.addAll(arr.size(), arr);
		
		arr.forEach(System.out::println);
		System.out.println();
	}

}
