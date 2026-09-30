package comparing_objects;

import java.util.Comparator;

public class SortStudentsByName implements Comparator<StudentsCustom>{

		@Override
		public int compare(StudentsCustom x, StudentsCustom y) {
			return x.name.compareTo(y.name);
		}

		
	}

