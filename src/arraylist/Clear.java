package arraylist;

import java.util.ArrayList;

public class Clear {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add(arr.size(), "A");
		arr.addAll(arr.size(), arr);
		
		arr.forEach(System.out::println);
		System.out.println("arr size: " + arr.size());
		System.out.println();
		
		arr.clear();
		
		arr.forEach(System.out::println);
		System.out.println("arr size: " + arr.size());
		System.out.println();
	}

}
