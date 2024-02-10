package FactoryMethod;

public class CLang implements Lang{
    @Override
    public Developer getDeveloper() {
        return new CDeveloper();
    }
}
