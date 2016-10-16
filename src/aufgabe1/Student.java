package aufgabe1;

import java.util.*;

/**
 * Praktikum TIPM2, WS16-17 Gruppe: Marvin Petersen
 * (marvin.petersen@haw-hamburg.de), Sahin Tekes (sahin.tekes@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt xx, Aufgabe xx Verwendete Quellen:
 */

public class Student implements Comparable<Student> {

  private String vorname;
  private String nachname;
  private int matrikelnummer;
  private List<Pruefungsleistung> pvl;
  private static int anzahlStudent;

  public Student(String vorname, String nachname) {
    this.vorname = vorname;
    this.nachname = nachname;
    anzahlStudent++;
    matrikelnummer = anzahlStudent;
  }

  @Override
  public int hashCode() {
    return matrikelnummer;
  }

  @Override
  public boolean equals(Object anderesObject) {
    if (!(anderesObject instanceof Student)) {
      return false;
    }
    Student andereStudent = (Student) anderesObject;
    return (this.hashCode() == andereStudent.hashCode());
  }

  @Override
  public int compareTo(Student andererStudent) {
    Integer matrikelnummer1 = getMatrikelnummer();
    Integer matrikelnummer2 = andererStudent.getMatrikelnummer();

    return matrikelnummer1.compareTo(matrikelnummer2);
  }

  public int getMatrikelnummer() {
    return matrikelnummer;
  }

  public String getNachname() {
    return nachname;
  }

  public String getVorname() {
    return vorname;
  }

}
