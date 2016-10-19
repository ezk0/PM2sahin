
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

	public void liesXMLdatei() throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		org.w3c.dom.Document document = builder.parse(new File("src/aufgabe1/sensorWohnzimmer.xml"));
		NodeList rootElement = document.getElementsByTagName("Sensor");

		for (int i = 0; i < rootElement.getLength(); i++) {
			System.out.println(rootElement.item(i).getAttributes().item(i).getNodeValue());
			

		}
		rootElement = document.getElementsByTagName("Messung");
		for (int i = 0; i < rootElement.getLength(); i++) {
			System.out.println(rootElement.item(i).getAttributes().getNamedItem("wert").getNodeValue() + " "
					+ rootElement.item(i).getAttributes().getNamedItem("zeitstempel").getNodeValue());
		}

	}

	public static void main(String[] args)
			throws IOException, ParserConfigurationException, SAXException, TransformerException {

		Sensoren sensor = new Sensoren();
		sensor.liesXMLdatei();
	}
}
