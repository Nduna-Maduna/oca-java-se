package arraylist;

import java.util.ArrayList;

public class Get {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		
		array.add(array.size(), "A");
		
		System.out.println(array.get(array.size()-1));
	}

}
