package understandingclassinheritance;

public class CellPhone implements Phone {
	private boolean callInProgress;

	@Override
	public void dialNumber(int number) {
		/* Dial number via cell network */	
	}

	@Override
	public boolean isCallInProgress() {
		return callInProgress;
	}
	
}
