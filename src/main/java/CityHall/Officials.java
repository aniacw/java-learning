package CityHall;

import java.util.ArrayList;
import java.util.List;

public class Officials {
    private String firstName;
    private String lastName;
    private String dept;
    private List<Petitioners> listOfPetitioners = new ArrayList<>();

    public Officials(String firstName, String lastName, String dept) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = dept;
    }

    public void addPetitioner(Petitioners petitioners){///????
        this.listOfPetitioners.add(petitioners);
    }
}
