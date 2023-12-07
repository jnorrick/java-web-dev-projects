import java.util.ArrayList;

public class Course {
    private String courseName;
    private String courseInstructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName, String courseInstructor, ArrayList<Student> enrolledStudents) {
        this.courseName = courseName;
        this.courseInstructor = courseInstructor;
        this.enrolledStudents = enrolledStudents;
    }
}
