package w3l11.prob1;
import java.util.*;

public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key, Student> processedStudnt = new HashMap<>();
		
		for(Student student: students) {
			Key sKey = new Key(student.getFirstName(), student.getLastName());
			processedStudnt.put(sKey, student);
		}
		
		return processedStudnt;
	}
}
