
/**
*
*
*
*/
package aufgabe1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;
import javax.xml.transform.TransformerException;

import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Praktikum TIPM2, WS16-17 Gruppe: Marvin Petersen
 * (marvin.petersen@haw-hamburg.de), Sahin Tekes (sahin.tekes@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 1, Aufgabe 1.2 Verwendete Quellen:
 */
public class Sensoren {

	private List<String> liste = new ArrayList<String>();

	/**
	 * Speichert den Ort an dem der Sensor steht in einer Objektvariable
	 */
	private String id;

	/**
	 * Speichert die Messungen in einer Liste
	 */
	private List<Messung> messungen;

	public Sensoren(String id) {
		this.id = id;
	}

	/**
	 * default
	 */
	public Sensoren() {
	}

	/**
	 * Getter für den Ort/ID
	 * 
	 * @return
	 */

	public String getID() {
		return id;
	}

	public void liesXMLdatei(String dateiname) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		org.w3c.dom.Document document = builder.parse(new File("src/aufgabe1/sensorWohnzimmer.xml"));
		NamedNodeMap attribute = document.getDocumentElement().getAttributes();

		for (int i = 0; i < attribute.getLength(); i++) {
			org.w3c.dom.Node attribut = attribute.item(i);
			System.out.println(attribut.getNodeName() + ": " + attribut.getNodeValue());
		}

		// NamedNodeMap unterAttri=document.getDocumentElement().getChildNodes()

		// attribute = document.getDocumentElement().getFirstChild().;
		
		String string = "";

		for (int i = 0; i < document.getDocumentElement().getChildNodes().getLength(); i++) {
			org.w3c.dom.Node kindknotenMessung = document.getDocumentElement().getChildNodes().item(i);

			if (kindknotenMessung instanceof Element) {
				Element kindElement = (Element) kindknotenMessung;
				
				NodeList nodemap=document.getDocumentElement().getChildNodes();
				string=nodemap.item(i).getLocalName();
						

				
//				System.out.println(
//						
//						kindElement.getNodeName() + ": "
//						+ document.getDocumentElement().getChildNodes().item(i).getAttributes().item(0)
//						+ " "
//						+ document.getDocumentElement().getChildNodes().item(i).getAttributes().item(1));
//			}
			
			System.out.println(string);
			}
		}

		
	}

	public static void main(String[] args)
			throws IOException, ParserConfigurationException, SAXException, TransformerException {

		Sensoren sensor = new Sensoren();
		sensor.liesXMLdatei("sensorWohnzimmer");
	}
}
