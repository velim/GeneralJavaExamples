package cz.velim.jaxbexample.config;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import cz.velim.jaxbexample.jaxb.Config;

public class ConfigReader {

	class Data {

		private String id;
		private String type;
		private String mainServer;
		private String loadClass;

		public String getLoadClass() {
			return loadClass;
		}

		public void setLoadClass(String loadClass) {
			this.loadClass = loadClass;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getMainServer() {
			return mainServer;
		}

		public void setMainServer(String mainServer) {
			this.mainServer = mainServer;
		}

		public String toString() {
			return this.id + "\n" + this.type + "\n" + this.loadClass + "\n"
					+ this.mainServer;

		}
	}

	private Data data = new Data();

	public void readFromFile(String filepath) throws JAXBException {
		System.out.println("Reading file " + filepath);

		JAXBContext jc = JAXBContext.newInstance("cz.velim.jaxbexample.jaxb");
		Unmarshaller u = jc.createUnmarshaller();
		Config config = (Config) u.unmarshal(new File(filepath));

		data.setId(config.getId());
		data.setType(config.getType());
		data.setMainServer(config.getMainServer());
		data.setLoadClass(config.getLoadClass());

		System.out.println(data);

	}

}
