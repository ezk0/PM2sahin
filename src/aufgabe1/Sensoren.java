
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

import javax.xml.parsers.ParserConfigurationException;

import javax.xml.transform.TransformerException;



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

	public Sensoren(String ort) {
		this.id = ort;
	}

	/**
	 * Getter für den Ort
	 * 
	 * @return
	 */

	public String getID() {
		return id;
	}

	public void liesXMLdatei(String dateiname) throws IOException {
		File xmlDatei = new File(
				"src/" + this.getClass().getPackage().toString().replace("package ", "") + "/" + dateiname + ".xml");

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(xmlDatei));
		} catch (FileNotFoundException e) {
			br.close();
			e.printStackTrace();
		}

		System.out.println(xmlDatei.exists());

		List<String> liste = new ArrayList<String>();
		
		String zeile = null;
		try {
			while ((zeile = br.readLine()) != null) {
				liste.add(zeile);
			}
		} catch (IOException e) {
			br.close();
			e.printStackTrace();
		}
	}

	// public void liesXMLdatei(String datei) throws IOException{
	// BufferedReader reader = null;
	// reader = new BufferedReader(new FileReader(datei+".xml"));
	// String zeile = null;
	// while ((zeile = reader.readLine()) != null){
	// liste.add(zeile);
	// }
	// reader.close();
	// }

	public static void main(String[] args)
			throws IOException, ParserConfigurationException, SAXException, TransformerException {
		Sensoren sensor = new Sensoren("SahinSexzimmer");
		// sensor.liesXMLdatei("src/aufgabe1/sensorWohnzimmer");
		// System.out.println(sensor.liste.toString());
		// sensor.bearbeiteXMLdatei("sensorWohnzimmer", "WC");
		// System.out.println(sensor.liste.toString());

		sensor.liesXMLdatei("sensorWohnzimmer");
		System.out.println();

	}
}
