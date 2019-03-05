package Collections;

import java.util.Comparator;

import oops.Student1;

public class sortbymarks implements Comparator<Student1> {
	public int compare(Student1 o1,Student1 o2) {
		if(o1.getMarks()>o2.getMarks())
			return 1;
		else
			return -1;
		
	}
}
