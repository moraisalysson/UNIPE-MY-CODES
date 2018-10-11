package cap3;

//Fig 3.1 Gradebook.java
//página 58

public class GradeBook {
	
	private String courseName;
	private String instructorName;
	
	
	public GradeBook(String courseName, String instructorName) {
		this.courseName = courseName;
		this.instructorName = instructorName;
	}
	
	public void displayMessage() {
		System.out.printf("Welcome to the grade book for: %s!\n", this.getCourseName());
		System.out.printf("This course is presented by: %s\n", this.getInstructorName());
	}
	
	public void setCourseName(String name) {
		this.courseName = name;
	}

	public String getCourseName() {
		return this.courseName;
	}
	
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	public String getInstructorName() {
		return this.instructorName;
	}
}	
