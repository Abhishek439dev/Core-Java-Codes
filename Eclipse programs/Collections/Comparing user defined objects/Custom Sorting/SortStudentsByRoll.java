package comparing_objects;

import java.util.Comparator; //importing Comparator interface for custom sorting. 
//implementing the Comparator interface so that we can override the compare method.
public class SortStudentsByRoll implements Comparator<StudentsCustom>{

	//overriding the compare method which accepts two arguments, the first one is previously present key and the second 
	//argument is for next key. 
	@Override
	public int compare(StudentsCustom x, StudentsCustom y) {
		return x.roll - y.roll; //previous key - current key
	}

	
}
