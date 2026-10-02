package comparing_objects;

import java.util.Comparator; //importing Comparator interface to override the compare method.
//this class has to implement the Comparator interface and override the compare method. The generics should be defined with the type of objects we are going to compare.
public class SortStudentsByMarks implements Comparator<StudentsCustom>{

	//Overriding the compare method.
	@Override
	//the first argument accepts the previously present key and second one accepts the current key.
	public int compare(StudentsCustom x, StudentsCustom y) {
		return x.marks.compareTo(y.marks);
	}

	
}
