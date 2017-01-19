package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		Spliterator<String> listSpliterator = list.spliterator();
		
		System.out.println(" " + listSpliterator.characteristics());
		System.out.println(" " + listSpliterator.estimateSize());
		
		Spliterator<String> newPartition = listSpliterator.trySplit();
		System.out.println(" " + newPartition.estimateSize());
		System.out.println(" " + listSpliterator.estimateSize());
		
	}

}
