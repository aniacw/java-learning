package FamilyTree;

import java.security.PublicKey;

public class Parent {
    private String name;
    private Integer age;
    private boolean isMarried;
    private Child child;

    public Parent() {
    }

    public Parent(String name, Integer age, boolean isMarried, Child child) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
        this.child = child;
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

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public static class ParentBuilder {
        private String name;
        private Integer age;
        private boolean isMarried;
        private Child child;

        public static ParentBuilder parentBuilder() {
            return new ParentBuilder();
        }

        public ParentBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ParentBuilder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public ParentBuilder withIsMarried(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public ParentBuilder withChild(Child child){
            this.child = child;
            return this;
        }

        public Parent build() {
            Parent parent = new Parent();
            parent.setName(name);
            parent.setAge(age);
            parent.setMarried(isMarried);
            parent.setChild(child);
            return parent;
        }
    }
}
