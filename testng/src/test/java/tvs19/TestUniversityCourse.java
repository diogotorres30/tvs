package tvs19;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUniversityCourse {
    
    @Test(expectedExceptions = InvalidOperationException.class)
    public void addCourseSameYearTest() throws InvalidOperationException{
        final Course course = new Course("ASA", CourseYear.SECOND); 
        final int max = 5;
        final UniversityCourse uCourse = new UniversityCourse(course, max);
        final Course c1 = new Course("IAC", CourseYear.FIRST);
        final Course c2 = new Course("FP", CourseYear.FIRST);
        uCourse.addCourse(c1, c2);
    }
    
    @Test
    public void addAndRemoveCourseTest() throws InvalidOperationException{
        final Course course = new Course("ASA", CourseYear.SECOND); 
        final int max = 5;
        final UniversityCourse uCourse = new UniversityCourse(course, max);
        final Course c1 = new Course("Compiladores", CourseYear.FIRST);
        final Set<Course> course_set = new HashSet<Course>();
        course_set.add(c1);
        uCourse.addCourse(c1, null);
        Assert.assertEquals(course_set, uCourse.getCourses());
    }

    @Test
    public void addOverflowCourseTest() throws InvalidOperationException{
        final Course course = new Course("ASA", CourseYear.SECOND); 
        final int max = 1;
        final UniversityCourse uCourse = new UniversityCourse(course, max);
        final Course c1 = new Course("SAD", CourseYear.FIRST);
        uCourse.addCourse(c1, null);
    }

    @Test
    public void addUnderflowCourseTest() throws InvalidOperationException{
        final Course course = new Course("ASA", CourseYear.SECOND); 
        final int max = 1;
        final UniversityCourse uCourse = new UniversityCourse(course, max);
        uCourse.removeCourse(course);
    }

    @Test
    public void getMaximumNumberOfCoursesTest() throws InvalidOperationException{
        final Course course = new Course("ASA", CourseYear.SECOND); 
        final int max = 5;
        final UniversityCourse uCourse = new UniversityCourse(course, max);
        Assert.assertEquals(max, uCourse.getMaximumNumberOfCourses());
    }

    @Test
    public void getNumberOfCoursesTest() throws InvalidOperationException{
        final Course course = new Course("ASA", CourseYear.SECOND); 
        final int max = 5;
        final UniversityCourse uCourse = new UniversityCourse(course, max);
        final Course c1 = new Course("Compiladores", CourseYear.FIRST);
        final Set<Course> course_set = new HashSet<Course>();
        course_set.add(c1);
        uCourse.addCourse(c1, null);
        Assert.assertEquals(course_set.size(), uCourse.getCourses().size());
    }
}