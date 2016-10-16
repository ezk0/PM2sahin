package aufgabe1;
import java.util.*;

public class NachVornameVergleichen implements Comparator<Student>{

 

@Override
public int compare(Student student1, Student student2) {
  String studi1=student1.getVorname()+student1.getNachname();
  String studi2=student2.getVorname()+student2.getNachname();

  
  return studi1.compareTo(studi2);
}
}
