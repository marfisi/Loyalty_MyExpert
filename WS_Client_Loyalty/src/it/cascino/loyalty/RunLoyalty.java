package it.cascino.loyalty;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class RunLoyalty{
	private static Logger log;
	
	public static void main(String[] args){
		PropertyConfigurator.configure("logdir/logLoyalty.properties");
		log = Logger.getLogger(RunLoyalty.class);
		log.info("START");
		
		Loyalty loyalty = new Loyalty(args);
		
		log.info("STOP");
		System.exit(0);
	}
}