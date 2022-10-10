package com.mas2022datascience.springsimulator;

import java.io.File;
import javax.management.AttributeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@SpringBootApplication
public class SpringSimulatorApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(SpringSimulatorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringSimulatorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("");
		if (args.length == 0) {
			runProducer();
		}
	}

	private void runProducer() {

		try {
			//creating a constructor of file class and parsing an XML file
			File file = new File("./tracab/POR - SUI - Tracking Raw Data - xml - xml.xml");
			//an instance of factory that gives a document builder
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			//an instance of builder to parse the specified xml file
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

			NodeList frameNodeList = doc.getElementsByTagName("Frame");
			for (int itr = 0; itr < frameNodeList.getLength(); itr++) {
				Node frameNode = frameNodeList.item(itr);
				if (frameNode.getNodeType() == Node.ELEMENT_NODE) {
					Element frameElem = (Element) frameNode;
					String utc = frameElem.getAttribute("utc");
					System.out.println(utc);

					NodeList objNodeList = frameElem.getElementsByTagName("Obj");
					for (int i = 0; i < objNodeList.getLength(); i++) {
						Node objNode = objNodeList.item(i);
						if (objNode.getNodeType() == Node.ELEMENT_NODE) {
							Element objElem = (Element) objNode;
							String objType = objElem.getAttribute("type");
							String objId = objElem.getAttribute("id");
							String objX = objElem.getAttribute("x");
							String objY = objElem.getAttribute("y");
							//String objZ = objElem.getAttribute("z");
							String objSampling = objElem.getAttribute("sampling");
							if (objId.equals("95417")) {
								System.out.println("test");
							}
						}
					}
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
