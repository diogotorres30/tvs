package tvs19;

public class Course{
    private String name;
    private CourseYear year;
    protected Result result;


    public Course(String name, CourseYear year){
        this.name = name;
        this.year = year;
        this.result.grade = 0.0;
    }

}