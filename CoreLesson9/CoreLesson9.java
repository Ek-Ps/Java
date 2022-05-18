package CoreLesson9;

import java.util.*;
import java.util.stream.Collectors;

/*
    Имеется следующая структура:
       interface Student {
            String getName();
            List<Course> getAllCourses();
        }
        interface Course {}
    1. Написать функцию, принимающую список Student и возвращающую список уникальных курсов, на которые подписаны студенты.
    2. Написать функцию, принимающую на вход список Student и возвращающую список из трех самых любознательных (любознательность определяется количеством курсов).
    3. Написать функцию, принимающую на вход список Student и экземпляр Course, возвращающую список студентов, которые посещают этот курс.
*/
public class CoreLesson9 {

    public static void main(String[] args) {
        Courses course1 = new Courses("Mathematics");
        Courses course2 = new Courses("Physics");
        Courses course3 = new Courses("Russian Language");
        Courses course4 = new Courses("Literature");

        List<Students> students = Arrays.asList(
                new Students("Smirnova", Arrays.asList(course1, course2, course2)),
                new Students("Ivanova", Arrays.asList(course3, course4)),
                new Students("Cherezzabornoguperekidailova", Arrays.asList(course1, course2, course3, course4)),
                new Students("Petrova", Arrays.asList(course3, course4)),
                new Students("Pupkina", Arrays.asList(course2, course3))
        );
        //1
        System.out.println("1. Список уникальных курсов: "
                + getUniqCourses(students)
        );

        //2
        System.out.println("2. Студенты: "
                + getFavoriteStudents(students)
                + " самые любознательные"
        );

        //3
        System.out.println("3. Студенты: "
                + getStudentsCourses(students, course1)
                + " посещают курс " + course1.toString()
        );
    }

    // 1
    public static List<Course> getUniqCourses(List<Students> students) {
        students = students == null ? new ArrayList<>() : students;

        return students.stream()
                .filter(Objects::nonNull)
                .map(Students::getAllCourses)
                .filter(Objects::nonNull)
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    //2
    public static List<Students> getFavoriteStudents(List<Students> students) {
        students = students == null ? new ArrayList<>() : students;

        return students.stream()
                .filter(Objects::nonNull)
                .sorted((o1, o2) -> {
                    List<Courses> c1 = o1.getAllCourses();
                    List<Courses> c2 = o2.getAllCourses();
                    return Integer.compare(
                            c2 == null ? 0 : c2.size(),
                            c1 == null ? 0 : c1.size()
                    );
                })
                .limit(3)
                .collect(Collectors.toList());
    }

    //3
    public static List<Students> getStudentsCourses(List<Students> students, Courses course) {
        students = students == null ? new ArrayList<>() : students;

        return students.stream()
                .filter(Objects::nonNull)
                .filter(student -> {
                    List<Courses> courses = student.getAllCourses();
                    courses = courses == null ? Collections.emptyList() : courses;
                    return courses.contains(course);
                })
                .collect(Collectors.toList());
    }
}

