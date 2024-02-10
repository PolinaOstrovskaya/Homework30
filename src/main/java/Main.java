import Builder.Develloper;

public class Main {
    public static void main(String[] args) {
        String develloper=new Develloper.Builder().setRank("Junior").setLanguage("Java").setSalary(345).build().toString();
        System.out.println(develloper);
    }
}