package collectionday3;

import java.util.Comparator;

public class ReversedNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.name.compareTo(o1.name);
	}
	
	

}
