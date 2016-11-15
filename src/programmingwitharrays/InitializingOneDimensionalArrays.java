package programmingwitharrays;

public class InitializingOneDimensionalArrays {

	public static void main(String[] args) {
		String[] clockTypes = new String[3];
		String clockTypes2[] = new String[3];
		clockTypes = new String[4];
		int alarms[] = new int[2];

		int[] alarms2 = {730,900};
		
		byte[] arrayOfBytes = new byte[3];
		for (byte b : arrayOfBytes) {
			System.out.println(b);
		}
		
		short[] arrayOfShorts = new short[3];
		for (short s : arrayOfShorts) {
			System.out.println(s);
		}
		
		int[] arrayOfInts = new int[3];
		for (int i : arrayOfInts) {
			System.out.println(i);
		}
		
		long[] arrayOfLongs = new long[3];
		for (long l : arrayOfLongs) {
			System.out.println(l);
		}
		
		float[] arrayOfFloats = new float[3];
		for (float f : arrayOfFloats) {
			System.out.println(f);
		}
		
		double[] arrayOfDoubles = new double[3];
		for (double d : arrayOfDoubles) {
			System.out.println(d);
		}
		
		boolean[] arrayOfBooleans = new boolean[3];
		for (boolean b : arrayOfBooleans) {
			System.out.println(b);
		}
		
		char[] arrayOfChars = new char[3];
		for (char c : arrayOfChars) {
			System.out.println(c);
		}
	}

}
