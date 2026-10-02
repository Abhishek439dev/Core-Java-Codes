package comparing_objects;

import java.util.Comparator;

public class SortStudentsByMarks implements Comparator<StudentsCustom>{

	@Override
	public int compare(StudentsCustom x, StudentsCustom y) {
		return x.marks.compareTo(y.marks);
	}

	
}
