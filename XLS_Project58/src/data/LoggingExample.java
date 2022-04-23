package data;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {
		Logger print = Logger.getLogger("devpinoyLogger");
		print.debug("Hello");
		print.debug(" how are you");

	}

}
