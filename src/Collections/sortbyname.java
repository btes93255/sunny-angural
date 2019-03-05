package Collections;

import java.util.Comparator;

import oops.Student1;

public class sortbyname implements Comparator<Student1> {

	
	

	@Override
	public int compare(Student1 o1, Student1 o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
