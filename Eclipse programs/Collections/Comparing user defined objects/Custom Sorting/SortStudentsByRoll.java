package comparing_objects;

import java.util.Comparator;

public class SortStudentsByRoll implements Comparator<StudentsCustom>{

	@Override
	public int compare(StudentsCustom x, StudentsCustom y) {
		return x.roll - y.roll;
	}

	
}
