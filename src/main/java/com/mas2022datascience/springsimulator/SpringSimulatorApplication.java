package com.mas2022datascience.springsimulator;

import com.mas2022datascience.avro.v1.playerMetrics;
import com.mas2022datascience.springsimulator.producer.KafkaProducer;
import java.io.File;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@SpringBootApplication
public class SpringSimulatorApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(SpringSimulatorApplication.class);

	@Autowired
	private KafkaProducer kafkaProducer;

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

			//Match Information
			NodeList matchNodeList = doc.getElementsByTagName("Match");
			Node matchNode = matchNodeList.item(0);
			Element matchElem = (Element) matchNode;
			String matchId = matchElem.getAttribute("id");
			//<Match id="2024419" dateMatch="2019-06-05T18:45:00" matchNumber="139">

			//Competition Information
			NodeList competitionNodeList = doc.getElementsByTagName("Competition");
			Node competitionNode = competitionNodeList.item(0);
			Element competitionElem = (Element) competitionNode;
			String competitionId = competitionElem.getAttribute("id");
			//<Competition id="20192" name="UEFA Nations League 2019" />

			//Stadium Information
			NodeList stadiumNodeList = doc.getElementsByTagName("Stadium");
			Node stadiumNode = stadiumNodeList.item(0);
			Element stadiumElem = (Element) stadiumNode;
			String stadiumId = stadiumElem.getAttribute("id");
			//<Stadium id="85429" name="Estádio do Dragão" pitchLength="10500" pitchWidth="6800" />

			//Phases Information
			NodeList phaseNodeList = doc.getElementsByTagName("Phase");
			Node phaseNode = phaseNodeList.item(0);
			Element phaseElem = (Element) phaseNode;
			String phaseStart = phaseElem.getAttribute("start");
			//<Phase start="2019-06-05T18:46:49.43" end="2019-06-05T19:32:53.14" leftTeamID="110" />
			phaseNode = phaseNodeList.item(1);
			phaseElem = (Element) phaseNode;
			phaseStart = phaseElem.getAttribute("start");
			//<Phase start="2019-06-05T19:47:59.794" end="2019-06-05T20:38:38.079" leftTeamID="128" />

			// Ball and Player Information
//			<Frame utc="2019-06-05T18:47:25.843" isBallInPlay="1" ballPossession="Away">
//        <Objs>
//          <Obj type="7" id="0" x="4111" y="2942" z="11" sampling="0" />
//          <Obj type="0" id="63706" x="3684" y="3059" sampling="0" />
//			    ...
//          <Obj type="1" id="1905360" x="694" y="2007" sampling="0" />
//        </Objs>
//      </Frame>
			NodeList frameNodeList = doc.getElementsByTagName("Frame");
			for (int itr = 0; itr < frameNodeList.getLength(); itr++) {
				Node frameNode = frameNodeList.item(itr);
				if (frameNode.getNodeType() == Node.ELEMENT_NODE) {
					Element frameElem = (Element) frameNode;

					//2019-06-05T18:53:18.003
					String utcString = frameElem.getAttribute("utc");
					// fix utc time format
					if (utcString.length() == 19) {
						utcString = utcString + ".000";
					}
					utcString = (utcString + "000").substring(0, 23);

					System.out.println(utcString);

					DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS")
							.withZone(ZoneOffset.UTC);;
					long utc = Instant.from(fmt.parse(utcString)).toEpochMilli();
					if (utcString.equals("2019-06-05T18:43:09.413")) {
						System.out.println("test");
					}

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

							// not the ball
							if (!objId.equals("0")){
								//player
								playerMetrics playerMetric = playerMetrics.newBuilder()
										.setCreatedAt(Instant.ofEpochSecond(utc))
										.setX(Integer.parseInt(objX))
										.setY(Integer.parseInt(objY))
										.setVelocity(0)
										.setVelocityVector(Arrays.asList(0.0, 0.0))
										.setAcceleration(0)
										.setAccelerationVector(Arrays.asList(0.0, 0.0))
										.setPressingIndex(0.0)
										.setControlIndex(0.0)
										.setZone(0)
										.build();
								kafkaProducer.produce(matchId,playerMetric);
							} else {
								//ball

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
