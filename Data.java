import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Data {

    public static List<Student> getStudentList() {
        Course c1 = new Course("Русский");
        Course c2 = new Course("Английский");
        Course c3 = new Course("Китайский");
        Course c4 = new Course("Японский");
        Course c5 = new Course("Испанский");
        Course c6 = new Course("Немецкий");
        Course c7 = new Course("Французский");
        Course c8 = new Course("Португальский");
        Course c9 = new Course("Хинди");
        Course c10 = new Course("Латынь");

        Student s1 = new Student("Анна", Arrays.asList(c1, c5, c9));
        Student s2 = new Student("Борис", Arrays.asList(c5, c4));
        Student s3 = new Student("Варавара", Arrays.asList(c2, c3, c8, c9));
        Student s4 = new Student("Герасим", Arrays.asList(c9));
        Student s5 = new Student("Диана", Arrays.asList(c4, c5));
        Student s6 = new Student("Егор", Arrays.asList(c1, c6, c7, c10));
        Student s7 = new Student("Жак", Arrays.asList(c9, c10));
        Student s8 = new Student("Зинаида", Arrays.asList(c4, c5, c10));
        Student s9 = new Student("Ирина", Arrays.asList(c1, c7, c8));
        Student s10 = new Student("Каролина", Arrays.asList(c1, c7, c3, c6, c9));
        Student s11 = new Student("Леонид", Arrays.asList(c2, c8));
        Student s12 = new Student("Матвей", Arrays.asList(c2, c3, c6));
        Student s13 = new Student("Николай", Arrays.asList(c4, c7));
        Student s14 = new Student("Олег", Arrays.asList(c5, c6, c10));
        Student s15 = new Student("Параскева", Arrays.asList(c3, c4));
        Student s16 = new Student("Рамиль", Arrays.asList(c6));
        Student s17 = new Student("Сергей", Arrays.asList(c10));
        Student s18 = new Student("Татьяна", Arrays.asList(c2, c8, c9));
        Student s19 = new Student("Ульяна", Arrays.asList(c4, c5));
        Student s20 = new Student("Федот", Arrays.asList(c3, c4, c6, c8));

        return Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
    }

    public static Course getRandomCourse() {
        Random random = new Random();
        List<Course> courses = getListCourses();
        return courses.get(random.nextInt(courses.size()));
    }

    private static List<Course> getListCourses() {
        return Arrays.asList(new Course("a"),
                new Course("b"),
                new Course("c"),
                new Course("d"),
                new Course("e"),
                new Course("f"));
    }
}
