package arraylist;

import java.util.ArrayList;

public class EnsureCapacity {
	

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();// initial capacity is 10
		array.ensureCapacity(100);
		
		
		for (int i = 0; i < 100; i++) {
			array.add("A");
		}
		
		
	}
	
}
