package packagingcompilinginterpretingjavacode;

/* Import static member ITALY */
import static java.util.Locale.ITALY;

/* Import all static members in class Locale */
import static java.util.Locale.*;

public class StaticImportStatements {
	public static void main(String[] args) {
		System.out.println("Locale: " + ITALY);
		System.out.println("Locale: " + GERMANY);
		System.out.println("Locale: " + JAPANESE);
	}
}
