package programmingwithjavaoperatorsandstrings;

public class CompoundAssignmentOperators {

	public static void main(String[] args) {
		byte z = 8;
		//byte c = 2 % z;
		byte a;
		a = 10;
		System.out.println(a += 3);
		System.out.println(a = (byte)(a + 3));
		
		//short j = 400;
		//j = 5 * j;
		
		/*
		a = 15;
		System.out.println(a -= 3);
		a = 20;
		System.out.println(a *= 3);
		a = 25;
		System.out.println(a /= 3);
		a = 30;
		System.out.println(a %= 3);
		a = 35;
		*/
		// Optional as outside the scope of the exams
		//System.out.println(a = a & 3);
	}

}
