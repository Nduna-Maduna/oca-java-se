package understandingclassinheritance;

import java.io.File;

public class PrinterFaxCombo implements Fax, Printer {
	private Object incomingFax;
	private int inkLevel;

	public void sendFax(File f, int number) {
		dialNumber(number);
		faxFile(f);
	}

	public Object getReceivedFaxes() {
		return incomingFax;
	}
	
	public void printFile(File f) {
		sendFileToPrinter(f);
	}
	
	public int getInkLevel() {
		return inkLevel;
	}
	
	private boolean dialNumber(int number) {
		boolean success = true;
		return success;
	}

	private void faxFile(File f) {
		
	}
	
	private void sendFileToPrinter(File f) {
		
	}



	

	

}
