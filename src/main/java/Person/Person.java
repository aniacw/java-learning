package Person;

public class Person {
    private String name;
    private String surname;
    private Sex sex;
    private Agreement agreement;

    public Person() {
    }

    public Person(String name, String surname, Sex sex, Agreement agreement) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.agreement = agreement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Agreement getAgreement() {
        return agreement;
    }

    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }

    public static class PersonBuilder {
        private String name;
        private String surname;
        private Sex sex;
        private Agreement agreement;

        public static PersonBuilder personBuilder() {
            return new PersonBuilder();
        }

        public PersonBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder withSex(Sex sex) {
            this.sex = sex;
            return this;
        }

        public PersonBuilder withAgreement(Agreement agreement) {
            this.agreement = agreement;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.setName(name);
            person.setSurname(surname);
            person.setSex(sex);
            person.setAgreement(agreement);
            return person;
        }
    }
}