package CityHall;

import java.util.ArrayList;
import java.util.List;

public class Petitioners {
    private String firstName;
    private String lastName;
    private char matterType;

    public Petitioners(String firstName, String lastName, char matterType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matterType = matterType;
    }

//    List<Petitioners> petitionerList =new ArrayList<Petitioners>();
//
//    public Petitioners(){
//        petitionerList.add(new Petitioners("John", "Jackson", 'A'));
//        petitionerList.add(new Petitioners("Amanda", "Night", 'B'));
//        petitionerList.add(new Petitioners("Chloe", "Cruz", 'A'));
//        petitionerList.add(new Petitioners("Rachel", "Zane", 'C'));
//        petitionerList.add(new Petitioners("Mike", "Ross", 'A'));
//        petitionerList.add(new Petitioners("Kathy", "Paris", 'B'));
//        petitionerList.add(new Petitioners("Jonathan", "Perry", 'A'));
//        petitionerList.add(new Petitioners("Samuel", "Sake", 'C'));
//        petitionerList.add(new Petitioners("Richard", "Branson", 'C'));
//        petitionerList.add(new Petitioners("Thomas", "Blake", 'B'));
//
//    }

    public char getMatterType() {
        return matterType;
    }
}