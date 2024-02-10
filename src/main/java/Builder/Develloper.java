package Builder;

public class Develloper {
    private String Language;
    private String Rank;
    private Integer Salary;
    private Integer Experience;


    public  static class Builder {
        private Develloper develloper;

        public Builder() {
            develloper = new Develloper();
        }

        public Builder setLanguage(String Language) {
            develloper.Language= Language;
            return this;
        }

        public Builder setRank(String Rank) {
            develloper.Rank = Rank;
            return this;
        }

        public Builder setSalary(Integer Salary) {
            develloper.Salary = Salary;
            return this;
        }

        public Builder setExperience(Integer Experience) {
            develloper.Experience = Experience;
            return this;
        }

        public Develloper build() {
            return develloper;
        }
    }
}
