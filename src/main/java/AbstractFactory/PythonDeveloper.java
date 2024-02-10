package AbstractFactory;

public class PythonDeveloper implements Developer{
    @Override
    public void teach() {
        System.out.println("Здесь будет изучаться Python");
    }
}
