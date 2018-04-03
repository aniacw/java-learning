package Person;

public class Sex {
    private Integer code;
    private String displayName;

    public Sex() {
    }

    public Sex(Integer code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public static class SexBuilder {
        private Integer code;
        private String displayName;

        public static SexBuilder sexBuilder() {
            return new SexBuilder();
        }

        public SexBuilder withCode(Integer code) {
            this.code = code;
            return this;
        }

        public SexBuilder withDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Sex build() {
            Sex sex = new Sex();
            sex.setCode(code);
            sex.setDisplayName(displayName);
            return sex;
        }
    }
}