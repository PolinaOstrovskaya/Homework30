package FactoryMethod;

public interface Lang {

        default void LangInfo(){
            Developer developer=getDeveloper();
            System.out.println(" Они изучают "+developer.getLanguage() +" язык!");
        }
        Developer getDeveloper();
    }
