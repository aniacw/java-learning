package FamilyTree;

public class Child {
    private String name;
    private Integer age;
    private char sex;
    private Grandchild grandchild;

    public Child() {
    }

    public Child(String name, Integer age, char sex, Grandchild grandchild) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.grandchild = grandchild;
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

    public Grandchild getGrandchild() {
        return grandchild;
    }

    public void setGrandchild(Grandchild grandchild) {
        this.grandchild = grandchild;
    }

    public static class ChildBuilder {
        private String name;
        private Integer age;
        private char sex;
        private Grandchild grandchild;

        public static ChildBuilder childBuilder() {
            return new ChildBuilder();
        }

        public ChildBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ChildBuilder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public ChildBuilder withSex(char sex) {
            this.sex = sex;
            return this;
        }

        public ChildBuilder withGrandchild(Grandchild grandchild){
            this.grandchild = grandchild;
            return this;
        }

        public Child build() {
            Child child = new Child();
            child.setName(name);
            child.setAge(age);
            child.setSex(sex);
            child.setGrandchild(grandchild);
            return child;
        }
    }
}
