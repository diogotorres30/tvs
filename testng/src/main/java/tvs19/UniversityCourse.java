package tvs19;

import java.util.List;
import java.util.Set;

public class UniversityCourse {
    private int maximumNumberOfCourses;
    private List<Course> courses;

    /**
    * Creates a university course with a single course (represented by parameter course)
    * and whose maximum number of courses is specified by parameter max.
    **/
    public UniversityCourse(Course course, int max) throws InvalidOperationException {
        this.courses.add(course);
        if(max < 50){
            this.maximumNumberOfCourses = max;
        }
        else{
            throw new InvalidOperationException();
        }
        
    }
    /**
    * Adds c1 to the list of courses of this university course. If c2 is a valid course then
    * it is set as a precedence of c1. If c2 is null then c1 is added without any precedence.
    **/
    public void addCourse(Course c1, Course c2) throws InvalidOperationException {
        this.courses.add(c1);

    }
    // Removes a course from the list of courses of this university course.
    public void removeCourse(Course c) throws InvalidOperationException {

    }
    // Adds a precedence between c1 and c2, meaning that c1 must precede c2.
    public void addPrecedence(Course c1, Course c2) throws InvalidOperationException {

    }
    // Removes precedence between c1 and c2. If c1 does not precede c2 then it does nothing.
    // Returns true if the precedence was removed, false otherwise.
    public boolean removePrecedence(Course c1, Course c2) {

    }
    // Returns the set of courses of this university course
    public Set<Course> getCourses() {

    }
    // Returns the maximum number of courses for this university course
    public int getMaximumNumberOfCourses() {

    }
    // Returns the number of courses of this university course
    public int getNumberOfCourses() {

    }
}