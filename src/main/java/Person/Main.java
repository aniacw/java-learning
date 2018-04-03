package Person;

import static Person.Agreement.AgreementBuilder.agreementBuilder;
import static Person.Sex.SexBuilder.sexBuilder;

public class Main {
    public static void main(String[] args) {

        Person.PersonBuilder.personBuilder()
                .withName("Megan")
                .withSurname("Jones")
                .withSex(sexBuilder()
                        .withCode(1)
                        .withDisplayName("Female")
                        .build())
                .withAgreement(agreementBuilder()
                        .withNumber(10)
                        .withContent("Trade Agreement")
                        .build())
                .build();

        System.out.println();
    }
}
