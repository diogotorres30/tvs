package tvs19;

import java.util.Set;

public class UniversityCourse {
    private int maximumNumberOfCourses;
    private Set<Course> courses;

    /**
     * Creates a university course with a single course (represented by parameter
     * course) and whose maximum number of courses is specified by parameter max.
     **/
    public UniversityCourse(Course course, int max) throws InvalidOperationException {
        if (max < 51 && max > 0) {
            this.maximumNumberOfCourses = max;
            this.courses.add(course);
        } else {
            throw new InvalidOperationException();
        }

    }

    /**
     * Adds c1 to the list of courses of this university course. If c2 is a valid
     * course then it is set as a precedence of c1. If c2 is null then c1 is added
     * without any precedence.
     **/
    public void addCourse(Course c1, Course c2) throws InvalidOperationException {
        if (courses.size() < this.maximumNumberOfCourses) {
            this.courses.add(c1);
        } else {
            throw new InvalidOperationException();
        }
        if (c2 != null && c2.getYear().ordinal() < c1.getYear().ordinal()) {
            c1.addPrecedence(c2);
            ;
        }

    }

    // Removes a course from the list of courses of this university course.
    public void removeCourse(Course c) throws InvalidOperationException {
        if (this.courses.contains(c)) {
            this.courses.remove(c);
        } else {
            throw new InvalidOperationException();
        }
    }

    // Adds a precedence between c1 and c2, meaning that c1 must precede c2.
    public void addPrecedence(Course c1, Course c2) throws InvalidOperationException {
        if (c1.getYear().ordinal() < c2.getYear().ordinal()) {
            if (c1.getPrecedences().size() < 4) {
                c1.addPrecedence(c2);
            } else {
                throw new InvalidOperationException();
            }
        } else {
            throw new InvalidOperationException();
        }
    }

    // Removes precedence between c1 and c2. If c1 does not precede c2 then it does
    // nothing.
    // Returns true if the precedence was removed, false otherwise.
    public boolean removePrecedence(Course c1, Course c2) {
        if (c2.getPrecedences().contains(c1)) {
            c2.removePrecedence(c1);
            return true;
        }
        return false;
    }

    // Returns the set of courses of this university course
    public Set<Course> getCourses() {
        return this.courses;
    }

    // Returns the maximum number of courses for this university course
    public int getMaximumNumberOfCourses() {
        return this.maximumNumberOfCourses;
    }

    // Returns the number of courses of this university course
    public int getNumberOfCourses() {
        return this.courses.size();
    }
}