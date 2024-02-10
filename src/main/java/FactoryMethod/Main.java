package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Lang course=new CLang();
        System.out.println(course.getDeveloper());
        course.LangInfo();
    }
}
