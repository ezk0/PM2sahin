package aufgabe1;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Messung {
	private String wert;
	private LocalDateTime zeitNow;
	private String zeitstempel;
	
	
	
	public String getWert(){
		return wert;
	}
	

	
	public LocalDateTime getZeitstempel(){
		return zeitNow;
	}
	
	/**
	 * schreibender Konstruktor
	 * @param wert
	 */
	public Messung(String wert){
		this.wert=wert;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
		zeitNow = LocalDateTime.now();
		this.zeitstempel = zeitNow.format(formatter);		
	}
	
	/**
	 * lesender Konstruktor
	 * @param wert
	 * @param zeitstempel
	 */
	public Messung(String wert, String zeitstempel){
		this.wert=wert;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
		zeitNow = LocalDateTime.now();
		this.zeitstempel = zeitstempel;		
	}
	
	public static void main(String[] args) {
		Messung messung1 = new Messung("5,4");
		System.out.println(messung1.zeitstempel);
	}

}
