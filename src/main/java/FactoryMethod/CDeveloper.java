package FactoryMethod;

public class CDeveloper implements Developer{
    @Override
    public String getLanguage() {
        return "C,C++,C#";
    }
}
