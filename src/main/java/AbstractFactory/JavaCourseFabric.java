package AbstractFactory;

public class JavaCourseFabric implements CourseFabric{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Language createLanguage() {
        return new JavaLanguage();
    }

    @Override
    public LessonProgram createLessonProgram() {
        return new JavaLessonProgram();
    }
}
