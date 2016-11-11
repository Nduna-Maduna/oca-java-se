package lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class OnTheJob {

	public static void main(String[] args) {
		List<Shoe> shoeList = new ArrayList<Shoe>();
		shoeList.add(new Shoe(true, "1"));
		
		
		// Prints retail prices of branded shoes
		for (Shoe s : shoeList) {
			if (s.isBranded()) {
				System.out.println(s.getRetailPrice());
			}
		}
		
		// Refactored with a stream and 
		shoeList.stream().filter(s -> s.isBranded()).forEach(s -> System.out.println(s.getRetailPrice()));
	}

}
