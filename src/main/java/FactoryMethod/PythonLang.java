package FactoryMethod;

public class PythonLang implements Lang{
    @Override
    public Developer getDeveloper() {
        return new PythonDeveloper();
    }
}
