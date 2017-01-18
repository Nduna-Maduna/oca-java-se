package arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveAll {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("A");
		list.add("B");
		list.add("B");
		
		if (list.remove("A")) {
			System.out.println("remove changed");
		}
		
		List<String> list2 = new ArrayList<>();
		list2.add("B");
		
		if (list.removeAll(list2)) {
			System.out.println("removeAll changed");
		}
		
		for (String string : list) {
			System.out.println(string);
		}
	}

}
