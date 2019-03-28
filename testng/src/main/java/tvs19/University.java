package tvs19;

import java.util.List;

enum CourseYear {
    FIRST, SECOND, THIRD, FOURTH, FIFTH;
}


public class University {
    
    
    public Course createCourse(String name, CourseYear year) {
        Course course = new Course(name,year);
        return course;
    }
    public Student createStudent(String name, String address) { 
        Student student = new Student(name,address);
        return student;
    }
    /**
    * Computes the tuition fees that the given student must pay. This value depends on several factors: Number
    * of courses enrolled by the first time, number of courses enrolled that the student has already
    * tried to do but has not succeeded yet, total number of enrollments made on those courses
    * and number of warnings received by the student.
    **/
    public int computeTuitionFees(Student st, List<Course> courses) {
        
     }
}