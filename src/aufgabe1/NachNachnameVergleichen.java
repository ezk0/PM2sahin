package aufgabe1;
import java.util.*;

public class NachNachnameVergleichen implements Comparator<Student>{

 

@Override
public int compare(Student student1, Student student2) {
  String studi1=student1.getNachname()+student1.getVorname();
  String studi2=student2.getNachname()+student2.getVorname();

  
  return studi1.compareTo(studi2);
}
}
