package programmingwithjavaoperatorsandstrings;

public class StringExamples {

	public static void main(String[] args) {
		//String str = "abc";
		
		char data[] = {'a', 'b', 'c'};
		String str = new String(data);
		
		System.out.println("abc");
		String cde = "cde";
		System.out.println("abc" + cde);
		String c = "abc".substring(2, 3);
		String d = cde.substring(1,2);
		
	}

}
