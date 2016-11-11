package lambdaexpressions;

public class Guitar {

	public static void main(String[] args) {
		// Includes Lambda Expression
		Strummable instrument = () -> {System.out.println("strummed!");};
		instrument.strum();
		
		instrument = new Strummable() {
			@Override
			public void strum() {
				System.out.println("strummed!");
			}
		};
		
		instrument.strum();
	}

	@FunctionalInterface
	interface Strummable {
		void strum();
	}
}

