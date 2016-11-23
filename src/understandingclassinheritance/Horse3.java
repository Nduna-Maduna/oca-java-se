package understandingclassinheritance;

public class Horse3 extends Animal {
	@Override
	public void rest() {
		/* Stand before rest */
		super.rest();
	}
	
	public void neigh() {
		/* Neigh */
	}
}
