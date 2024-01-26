package singleton;

public class Student {

	private static Student student;
	private Student() {
		System.out.println("private constructor called");
	}
	
	private static Student getInstance() {
		if(student == null) {
			synchronized(Student.class) {
				if(student==null) {
					student = new Student();
				}
			}
		}
		return student;
	}
}
