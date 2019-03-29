package tvs19;

import java.util.List;

public class Course {
    private String name;
    private CourseYear year;
    private Result result = new Result(0.0);
    private List<Course> precedences;

    public Course(String name, CourseYear year) {
        this.name = name;
        this.year = year;
    }

    public void setResult(Result r) {
        this.result = r;
    }

    public void addPrecedence(Course c) {
        this.precedences.add(c);
    }

    public CourseYear getYear() {
        return this.year;
    }

    public List getPrecedences() {
        return this.precedences;
    }

    public void removePrecedence(Course c) {
        this.precedences.remove(c);
    }

}