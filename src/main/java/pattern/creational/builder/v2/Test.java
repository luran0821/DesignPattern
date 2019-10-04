package pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .buildCourseName("Java ~")
                .buildCoursePPT("Java PPT~")
                .buildCourseVideo("Java Video~")
                .build();
        System.out.println(course);
    }
}
