package aufgabe1;

public class ArrayListe<T>{
	
	/**
	 * Obj-Var für die Anzahl an Elementen
	 */
	private int anzahlElemente;
	
	/**
	 * Array für Obj-Elemente
	 */
	private Object[] elemente;
	
	
	public ArrayListe(){
		anzahlElemente=0;
		elemente=new Object[0];
	}
	
	public void hinzufuegen(Object T){
		Object[] elementeKopie=new Object[anzahlElemente+1];
		for(int i=0;i<anzahlElemente;i++){
		elementeKopie[i]=elemente[i];
		elemente=elementeKopie;
		anzahlElemente++;
		elemente[anzahlElemente]=T;
		}
		
	}
	
	public int getAnzahlElemente(){
		return anzahlElemente;
	}
	
	

}
