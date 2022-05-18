package CoreLesson9;

import java.util.List;

public class Students implements Student {

    private final String name;
    private final List<Courses> courses;

    public Students(String name, List<Courses> courses) {
        this.name = name;
        this.courses = courses;
    }

    @Override
    public String getName() {return name;}
	
    @Override
    public List<Courses> getAllCourses() {return courses;}

    @Override
    public String toString() {return name;}

}
