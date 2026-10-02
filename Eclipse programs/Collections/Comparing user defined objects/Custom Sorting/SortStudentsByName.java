package comparing_objects;
//importing the Comparator interface to compare and sort the objects. 
import java.util.Comparator;

//implementing the Comparator interface to override the compare method.
public class SortStudentsByName implements Comparator<StudentsCustom>{

        //Overriding the compare method which accepts two arguments, the first one is the previously present  
	    //key and the second argument is the current key.
		@Override
		public int compare(StudentsCustom x, StudentsCustom y) {
			return x.name.compareTo(y.name); //previous key - current key
		}

		
	}

