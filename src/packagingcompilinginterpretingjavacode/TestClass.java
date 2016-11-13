package packagingcompilinginterpretingjavacode;

// Explicit import statements
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Implicit import statements
//import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.text.*;
//import java.time.*;
//import java.time.format.*;
//import java.util.*;
//import java.util.logging.*;

public class TestClass {

	public static void main(String[] args) throws IOException {
		/* Ensure directory has been created */
		Files.createDirectories(Paths.get("logs"));
		/* Get the date to be used in the filename */
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd_hhmm");
		LocalDateTime now = LocalDateTime.now();
		String date = df.format(now);
		/* Set up the filename in the logs directory */
		String logFileName = "logs\\testlog-" + date + ".txt";
		/* Set up Logger */
		FileHandler myFileHandler = new FileHandler(logFileName);
		myFileHandler.setFormatter(new SimpleFormatter());
		Logger ocajLogger = Logger.getLogger("OCAJ Logger");
		ocajLogger.setLevel(Level.ALL);
		ocajLogger.addHandler(myFileHandler);
		/* Log Message */
		ocajLogger.info("\nThis is a logged information message. ");
		/* Close the file */
		myFileHandler.close();

	}

}
