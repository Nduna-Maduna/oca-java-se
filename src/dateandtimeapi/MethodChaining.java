package dateandtimeapi;

import java.time.LocalDateTime;

public class MethodChaining {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now().plusYears(14).plusMonths(2).plusDays(10);
		System.out.println(ldt);
	}

}
