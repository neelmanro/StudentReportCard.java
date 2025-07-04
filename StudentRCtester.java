public class StudentRCtester{
public static void main(String args[]){
	System.out.println("--------  Student Report Card  ---------");
	printAll(students);

}


static Student[] students = new Student[100];
static int studentCount = 3;

static {
    Course[] courses1 = {
        new Course("Math", 85),
        new Course("English", 90),
        new Course("Physics", 78)
    };
    Course[] courses2 = {
        new Course("Math", 88),
        new Course("Chemistry", 91),
        new Course("Biology", 75)
    };
    Course[] courses3 = {
        new Course("Computer Science", 95),
        new Course("Math", 89)
    };

    students[0] = new Student("Neel Manro", 1001, courses1);
    students[1] = new Student("Vikas Sharma", 1002, courses2);
    students[2] = new Student("Sonia Gill", 1003, courses3);
}




public static void printAll(Student[] students){
    System.out.println("------------------------------------------");

    for(int i = 0; i < studentCount; i++){
        if (students[i] == null) continue;

        System.out.println("Student Name: " + students[i].getStudentName());
        System.out.println("Student ID: " + students[i].getStudentID());
        System.out.println();

        System.out.println("Courses and Grades:");
        Course[] c = students[i].getCourses();

        for (int j = 0; j < c.length; j++) {
            System.out.println("- " + c[j].getCourseName() + ": " + c[j].getCourseGrade());
        }

        System.out.println();
        System.out.printf("Average: %.2f\n", StudentRC.getAverage(students[i],studentCount));
        System.out.println("Final Grade: " + StudentRC.getFinalGrade(students[i],studentCount));



        System.out.println("------------------------------------------");
    }
}


}