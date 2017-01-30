package arraylist;

import java.util.ArrayList;

public class IsEmpty {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		array.add("A");
		array.clear();
		System.out.println("isEmpty: " + array.isEmpty());
	}

}
