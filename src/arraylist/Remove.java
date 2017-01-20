package arraylist;

import java.util.ArrayList;

public class Remove {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add(0, "C");
		list.add(0, "B");
		list.add(0, "A");
		
		System.out.println("list contains:");
		list.forEach(System.out::println);
		
		System.out.println("element removed by index: " + list.remove(list.size()-1));// remove (3-1) index 2
		
		System.out.println("list contains:");
		list.forEach(System.out::println);
		
		
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add(0, "X");
		list2.add(0, "X");
		list2.add(0, "X");
		list2.add(0, "X");
		list2.add(0, "X");
		
		System.out.println("list contains: ");
		list2.forEach(System.out::println);
		
		System.out.println("element removed by object: " + list2.remove("X"));
		
		System.out.println("list contains: ");
		list2.forEach(System.out::println);
	}

}
