
public class MainApp {

	
	
	
	protected static void test(int a, Integer b) {
		System.out.println("int a, Integer b");
	}
	
	protected static void test(Integer a, int b) {
		System.out.println("Integer a, int b");
	}
	
	public static void main(String[] args) {
		test(1, new Integer(1));// The method test(int, Integer) is ambiguous for the type MainApp
	}

}
