public class Student{
private String studentName;
private int studentID;
private Course[] courses;

public Student(String studentName, int studentID, Course[] courses){
this.studentName = studentName;
this.studentID = studentID;
this.courses = courses;

}

public String getStudentName(){
	return studentName;
}

public int getStudentID(){
	return studentID;
}

public Course[] getCourses(){
	return courses;
}








	
}