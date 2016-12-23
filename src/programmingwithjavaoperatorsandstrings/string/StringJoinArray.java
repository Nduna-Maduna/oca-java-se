package programmingwithjavaoperatorsandstrings.string;

public class StringJoinArray {

	public static void main(String[] args) {
		System.out.println("<" + String.join("-", "Java", "is", "cool", null) + ">");
		System.out.println("<" + String.join("-") + ">");
		
		try {
			// null delimiter
			System.out.println(String.join(null));
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			// null elements
			String arr[] = null;
			System.out.println(String.join("-", arr));
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}
		
		join("a");
		
		try {
			String arr[] = null;
			System.out.println(join("-", arr));
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}
		
		join(1);
	}
	
	
	
	static String join(String abc, String...def) {
		System.out.println(def.length);
		return "";
	}
	
	static String join(int abc, String ... def) {
		System.out.println(def.length);
		System.out.println("int");
		return "";
	}
	
	static String join(byte abc, String ... def) {
		System.out.println(def.length);
		System.out.println("byte");
		return "";
	}

}
