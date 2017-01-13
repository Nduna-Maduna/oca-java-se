package understandingclassinheritance;

import java.io.File;

public interface Fax {
	public void sendFax(File f, int number);
	public Object getReceivedFaxes();
}
