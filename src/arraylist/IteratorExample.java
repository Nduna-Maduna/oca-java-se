package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("A");
		array.add(array.size(), "B");
		array.addAll(array);
		array.addAll(array.size(), array);
		
		Iterator<String> iterator = array.iterator();
		
		//while (iterator.hasNext()) {
		//	System.out.println(iterator.next());
		//}
		
		iterator.forEachRemaining(System.out::println);
	}

}
