public class StudentRC {

public static double getAverage(Student s,int studentCount){
double average = 0;
double sum = 0;
double totalCourses = 0;
for(int i = 0;i < studentCount;i++){
	Course[] c = s.getCourses();
for(int j = 0;j < c.length;j++){
sum += c[j].getCourseGrade();
totalCourses++;	
}	
}
average = sum/totalCourses;
return average;
}

public static char getFinalGrade(Student s, int studentCount) {
    double avg = getAverage(s,studentCount);

    if (avg >= 86) {
        return 'A';
    } else if (avg >= 73) {
        return 'B';
    } else if (avg >= 65) {
        return 'C';
    } else if (avg >= 50) {
        return 'D';
    } else {
        return 'F';
    }
}






}