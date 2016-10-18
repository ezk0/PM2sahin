package aufgabe1;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Messung {
	private double wert;
	private LocalDateTime zeitstempel;
	public String formattedDateTime;
	
	
	
	public double getWert(){
		return wert;
	}
	

	
	public LocalDateTime getZeitstempel(){
		return zeitstempel;
	}
	
	public Messung(double wert){
		this.wert=wert;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
		zeitstempel = LocalDateTime.now();
		formattedDateTime = zeitstempel.format(formatter);		
	}
	
	public static void main(String[] args) {
		Messung messung1 = new Messung(5.4);
		System.out.println(messung1.formattedDateTime);
	}

}
