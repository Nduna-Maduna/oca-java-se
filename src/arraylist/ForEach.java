package arraylist;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		//lambda
		list.forEach(s->System.out.println(s));
		
		System.out.println();
		
		//method reference
		list.forEach(System.out::println);
	}

}
