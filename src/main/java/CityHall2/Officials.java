package CityHall2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    public Officials(List<Petitioners> listOfPetitioners) {
        Random random = new Random();
        Petitioners randomPetitioner = random.nextInt(listOfPetitioners.size());

        this.listOfPetitioners = listOfPetitioners;
    }
}
