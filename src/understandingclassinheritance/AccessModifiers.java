package understandingclassinheritance;

public class AccessModifiers {

	private String privateAccessModifier;
	String packagePrivateAccessModifier;
	protected String protectedAccessModifier;
	public String publicAccessModifier;
	
	
	private int numberOfPoints;
	private int calculateAverage() {return 1;}
	
	int maxSpeed;
	float calculateAcceleration() { return 11f;}
	
	protected int streetAddress;
	protected char getFirstChar() { return 'a';};
	
	public int streetAddress2;
	public int findZipCode() { return 1;}
	
	public static void main(String[] args) {
		
	}

}
