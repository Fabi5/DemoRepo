package Datapractice;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("devpinoyLogger");
		log.debug("anything");
		log.debug("your are winner");
		
	}

}
