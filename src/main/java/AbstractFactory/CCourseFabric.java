package AbstractFactory;

public class CCourseFabric implements CourseFabric{
    @Override
    public Developer createDeveloper() {
        return new CDeveloper();
    }

    @Override
    public Language createLanguage() {
        return new CLanguage();
    }

    @Override
    public LessonProgram createLessonProgram() {
        return new CLessonProgram();
    }
}
