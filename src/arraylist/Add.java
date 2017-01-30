package arraylist;

import java.util.ArrayList;

public class Add {

	// Appends the specified element to the end of this list.
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.forEach(System.out::println);
		System.out.println();
		arrayList.add("B");
		arrayList.forEach(System.out::println);
		System.out.println();
		
		
		
		ArrayList<String> arrayList2 = new ArrayList<>();
		arrayList2.add(arrayList2.size(), "A");// insert at the end of the list
		arrayList2.add(arrayList2.size(), "B");// insert at the end of the list
		
		arrayList2.forEach(System.out::println);
	}

}
