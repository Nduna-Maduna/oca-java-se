package programmingwitharrays;

public class UsingOneDimensionalArrays {

	public static void main(String[] args) {
		String[] clockTypes = {"Wrist Watch", "Desk Clock", "Wall Clock"};
		System.out.println(clockTypes[1]);
		
		if (clockTypes[0].equalsIgnoreCase("Grand Father Clock")) {
			System.out.println("It's a grand father clock!");
		}
		
		System.out.println("length: " + clockTypes.length);
	}

}
