package AbstractFactory;

public interface CourseFabric {
    Developer createDeveloper();
    Language createLanguage();
    LessonProgram createLessonProgram();
}
