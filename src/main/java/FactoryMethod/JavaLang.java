package FactoryMethod;

public class JavaLang implements Lang{
        @Override
        public Developer getDeveloper() {
            return new JavaDeloper();
        }
    }
