package programmingwitharrays;

public class ArrayCopy {

	public static void main(String[] args) {
		String[] clockTypes = {"Wrist Watch", "Desk Clock", "Wall Clock"};
		String[] newClockTypes = new String[2];
		System.arraycopy(clockTypes, 1, newClockTypes, 0, 2);

		for (String s : clockTypes) {
			System.out.println(s);
		}
		System.out.println("------");
		for (String s : newClockTypes) {
			System.out.println(s);
		}
	}

}
