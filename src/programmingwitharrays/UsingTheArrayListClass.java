package programmingwitharrays;

import java.util.ArrayList;

public class UsingTheArrayListClass {

	public static void main(String[] args) {
		Integer integer1 = new Integer(1300);
		Integer integer2 = new Integer(2000);
		ArrayList<Integer> basicArrayList = new ArrayList<Integer>();
		basicArrayList.add(integer1);
		basicArrayList.add(integer2);
		System.out.println(basicArrayList.get(0) + " - " + basicArrayList.get(1));
		System.out.println("Size: " + basicArrayList.size());
		Integer integer3 = new Integer(900);
		basicArrayList.add(1, integer3);
		System.out.println(basicArrayList.get(0) + " - " + basicArrayList.get(1) + " - " + basicArrayList.get(2));
		
		
		ArrayList<int[]> abc = new ArrayList<int[]>();
	}

}
