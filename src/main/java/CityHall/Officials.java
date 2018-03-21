package CityHall;

import java.util.ArrayList;
import java.util.List;

public class Officials {
    private String firstName;
    private String lastName;
    private char dept;
    private List<Petitioners> listOfPetitioners = new ArrayList<>();

    public Officials(String firstName, String lastName, char dept) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = dept;
    }

    public void addPetitioner(Petitioners petitioners){///????
        this.listOfPetitioners.add(petitioners);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getDept() {
        return dept;
    }

    public void setDept(char dept) {
        this.dept = dept;
    }

    public List<Petitioners> getListOfPetitioners() {
        return listOfPetitioners;
    }

    public void setListOfPetitioners(List<Petitioners> listOfPetitioners) {
        this.listOfPetitioners = listOfPetitioners;
    }

    public boolean supports(Petitioners petitioners){
        if(petitioners.getMatterType() == this.dept){
            return true;
        }else {
            return false;
        }
    }
}
