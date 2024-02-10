package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        CourseFabric courseFabric=new JavaCourseFabric();

        Developer developer = courseFabric.createDeveloper();
        Language language = courseFabric.createLanguage();
        LessonProgram lessonProgram = courseFabric.createLessonProgram();

        System.out.println(developer.toString());
        System.out.println(language.toString());
        System.out.println(lessonProgram.toString());
    }
}
