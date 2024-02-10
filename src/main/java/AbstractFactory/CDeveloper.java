package AbstractFactory;

public class CDeveloper implements Developer{
    @Override
    public void teach() {
        System.out.println("Здесь будет изучаться язык C");
    }
}
