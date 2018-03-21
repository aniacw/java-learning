package CityHall;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Officials housingDeptOfficial = new Officials("Hank", "Heywood", 'A');
        Officials cultureDeptOfficial = new Officials("Mary", "Jones", 'B');
        Officials transportDeptOfficial = new Officials("Harrison", "Wells", 'C');

        List<Petitioners> listOfPetitioners = new ArrayList<>();

        Petitioners petitioner1 = new Petitioners("John", "Jackson", 'A');
        Petitioners petitioner2 = new Petitioners("Amanda", "Night", 'B');
        Petitioners petitioner3 = new Petitioners("Chloe", "Cruz", 'A');
        Petitioners petitioner4 = new Petitioners("Rachel", "Zane", 'C');
        Petitioners petitioner5 = new Petitioners("Mike", "Ross", 'A');
        Petitioners petitioner6 = new Petitioners("Kathy", "Paris", 'B');
        Petitioners petitioner7 = new Petitioners("Jonathan", "Perry", 'A');
        Petitioners petitioner8 = new Petitioners("Samuel", "Sake", 'C');
        Petitioners petitioner9 = new Petitioners("Richard", "Branson", 'C');
        Petitioners petitioner10 = new Petitioners("Thomas", "Blake", 'B');

        listOfPetitioners.add(petitioner1);
        listOfPetitioners.add(petitioner2);
        listOfPetitioners.add(petitioner3);
        listOfPetitioners.add(petitioner4);
        listOfPetitioners.add(petitioner5);
        listOfPetitioners.add(petitioner6);
        listOfPetitioners.add(petitioner7);
        listOfPetitioners.add(petitioner8);
        listOfPetitioners.add(petitioner9);
        listOfPetitioners.add(petitioner10);

        for(int i = 0; i<listOfPetitioners.size(); i++){
            if(housingDeptOfficial.supports(listOfPetitioners.get(i))){
                housingDeptOfficial.addPetitioner(listOfPetitioners.get(i));
            }
            if(cultureDeptOfficial.supports(listOfPetitioners.get(i))){
                cultureDeptOfficial.addPetitioner(listOfPetitioners.get(i));
            }else {
                transportDeptOfficial.addPetitioner(listOfPetitioners.get(i));
            }
        }
        listOfPetitioners.removeAll(listOfPetitioners);///???

        System.out.println(housingDeptOfficial.getListOfPetitioners());
    }
}