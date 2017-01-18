import java.util.ArrayList;
import java.util.List;

public class TheList {

	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		
		//numberList.remove(2); // remove item at position 2 from the list
		//numberList.remove(new Integer(2)); // remove the number 2 from the list
		
		for (int i : numberList) {
			System.out.print(i + " ");
		}

	}

}
