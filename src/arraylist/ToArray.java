package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		Object[] array = list.toArray();
		for (Object object : array) {
			if (object instanceof String) {
				System.out.println(object);
			}
		}
		
		List<Object> asList = Arrays.asList(array);
		for (Object object : asList) {
			System.out.println(object);
		}
		
		String[] array2 = list.toArray(new String[] {"1"});
		for (String string : array2) {
			System.out.println(string);
		}
		
		String[] array3 = list.toArray(new String[0]);
		for (String string : array3) {
			System.out.println(string);
		}
		
		List<String> list2 = new ArrayList<>();
		list2.add("a");
		list2.add("b");
		String[] holder = new String[1];
		String[] array4 = list2.toArray(holder);// list2 cannot fit in holder
		System.out.println(holder[0]);// holder array is too small, 
		
	}
}
