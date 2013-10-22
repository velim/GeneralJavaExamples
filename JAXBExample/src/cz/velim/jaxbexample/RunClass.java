package cz.velim.jaxbexample;

import javax.xml.bind.JAXBException;

import cz.velim.jaxbexample.config.ConfigReader;

public class RunClass {

	/**
	 * @param args
	 * @throws JAXBException
	 */
	public static void main(String[] args) throws JAXBException {
		System.out.println("RunClass");
		if (args.length != 1) {
			System.out.println("no args!");
			return;
		}
		ConfigReader config = new ConfigReader();
		config.readFromFile(args[0]);
	}

}
