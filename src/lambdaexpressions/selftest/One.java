package lambdaexpressions.selftest;

public class One {
	

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				processDNA();
			}

		}).start();
		
		
		// refactor with a lambda expression
		new Thread(() -> processDNA()).start();
	}

	protected static void processDNA() {
		// TODO Auto-generated method stub
	}

}
