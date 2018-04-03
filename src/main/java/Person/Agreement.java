package Person;

public class Agreement {
    private Integer number;
    private String content;

    public Agreement() {
    }

    public Agreement(Integer number, String content) {
        this.number = number;
        this.content = content;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static class AgreementBuilder {
        private Integer number;
        private String content;

        public static AgreementBuilder agreementBuilder() {
            return new AgreementBuilder();
        }

        public AgreementBuilder withNumber(Integer number) {
            this.number = number;
            return this;
        }

        public AgreementBuilder withContent(String content) {
            this.content = content;
            return this;
        }

        public Agreement build(){
            Agreement agreement = new Agreement();
            agreement.setNumber(number);
            agreement.setContent(content);
            return agreement;
        }
    }
}