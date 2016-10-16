package aufgabe1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAufgabe1 {

  @Test
  public void testeEquals() {
    Student student1 = new Student("Marvin", "Petersen");
    Student student2 = new Student("Sahin", "Tekes");
    Object object = null;

    assertEquals("Equals erkennt keine zwei verschiedene Student-Objekte",
        student1.equals(student2), false);
    assertEquals("Equals erkennt keine gleiche Student-Objekte",
        student1.equals(student1), true);
    assertEquals("Equals erkennt nicht-Student-Objekt", student1.equals(object),
        false);

  }

  @Test
  public void testeCompareTo() {
    Student student1 = new Student("Marvin", "Petersen");
    Student student2 = new Student("Sahin", "Tekes");

    assertEquals("CompareTo erkennt höhere Matrikelnummer (1)",
        student2.compareTo(student1), 1);
    assertEquals("CompareTo erkennt gleiche Matrikelnummer (0)",
        student1.compareTo(student1), 0);
    assertEquals("CompareTo erkennt niedriegere Matrikelnummer (-1)",
        student1.compareTo(student2), -1);
  }

  @Test
  public void testeVergleicheNachname(){
    NachNachnameVergleichen vergleicheNachname=new NachNachnameVergleichen();
        Student student1= new Student("Sahin", "Tekes");
        Student student2= new Student("Marvin", "Petersen");

    
    assertEquals("Compare erkennt höherrangigen Buchstaben im Namen von Student 1", vergleicheNachname.compare(student1, student2),4);
    assertEquals("Compare erkennt gleichen Buchstaben im Namen von Student 1", vergleicheNachname.compare(student1, student1),0);
    assertEquals("Compare erkennt niedrigrangigeren Buchstaben im Namen von Student 1", vergleicheNachname.compare(student2, student1),1);
  }

}
