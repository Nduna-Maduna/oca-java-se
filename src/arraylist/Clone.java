package arraylist;

import java.util.ArrayList;

public class Clone {

	public static void main(String[] args) {
		// Shallow copy
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		ArrayList<String> list2 = (ArrayList<String>)list1.clone();
		if (list1.get(0) == list2.get(0)) {
			System.out.println("true");
		}
	}

}
