package programmingwithjavaoperatorsandstrings.string;

import java.util.LinkedList;
import java.util.List;

public class StringJoinIterable {

	public static void main(String[] args) {
		List<String> strings = new LinkedList<>();
		strings.add("Java");
		strings.add("is");
		strings.add("cool");
		System.out.println(String.join(" ", strings));
		
	}

}
