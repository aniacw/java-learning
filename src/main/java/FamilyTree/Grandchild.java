package FamilyTree;

import Chess.Game;

public class Grandchild {
    private String name;
    private Integer age;
    private char sex;

    public Grandchild() {
    }

    public Grandchild(String name, Integer age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static class GrandchildBuilder {
        private String name;
        private Integer age;
        private char sex;

        public static GrandchildBuilder grandchildBuilder() {
            return new GrandchildBuilder();
        }

        public GrandchildBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public GrandchildBuilder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public GrandchildBuilder withSex(char sex) {
            this.sex = sex;
            return this;
        }

        public Grandchild build() {
            Grandchild grandchild = new Grandchild();
            grandchild.setName(name);
            grandchild.setAge(age);
            grandchild.setSex(sex);
            return grandchild;
        }
    }
}