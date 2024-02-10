package AbstractFactory;

public class PythonCourseFabric implements CourseFabric{
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Language createLanguage() {
        return new PythonLanguage();
    }

    @Override
    public LessonProgram createLessonProgram() {
        return new PythonLessonProgram();
    }
}
