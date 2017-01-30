package arraylist;

import java.util.ArrayList;

public class Contains {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add(null);
		
		if (arr.contains(null)) {
			System.out.println("contains null true");
		}
	}

}
