import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ArrayListReplaceAll {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		
		for (String a : list) {
			System.out.print(a + " ");
		}
		
		list.replaceAll((String a) -> {return "c";});
		
		list.replaceAll(new UnaryOperator<String>() {
			@Override
			public String apply(String t) {
				return "b";
			}
		});
		
		System.out.println();
		for (String a : list) {
			System.out.print(a + " ");
		}
		
		
	}

}
