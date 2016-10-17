package aufgabe1;

import java.time.LocalDateTime;

public class Messungen {
	private double wert;
	private LocalDateTime zeitstempel;
	
	public double getWert(){
		return wert;
	}
	
	public LocalDateTime getZeitstempel(){
		return zeitstempel;
	}
	
	public Messungen(double wert){
		this.wert=wert;
		zeitstempel=LocalDateTime.now();
		
	}
	
//	public static void main(String[] args) {
//		Messungen mess = new Messungen(5.4);
//		System.out.println(mess.getZeitstempel());
//	}

}
