package arraylist;

import java.util.ArrayList;

public class RemoveIf {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		list.removeIf(s->s.startsWith("A"));
		
		list.forEach(System.out::println);
	}

}
