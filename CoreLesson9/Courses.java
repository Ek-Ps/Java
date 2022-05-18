package CoreLesson9;

public class Courses implements Course {
    private final String name;

    public Courses(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
