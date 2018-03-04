package Employees;

import java.util.ArrayList;
import java.util.List;

public final class CompanyStream {

    private final List<Employees> theEmployesListStream = new ArrayList<>();

    public CompanyStream(){
        theEmployesListStream.add(new Employees("John", "West", 5000));
        theEmployesListStream.add(new Employees("Thomas", "Allen", 2500));
        theEmployesListStream.add(new Employees("Eric", "Smoak", 3100));
        theEmployesListStream.add(new Employees("Kate", "Palmer", 2700));
        theEmployesListStream.add(new Employees("Jenny", "Pearson", 6500));
        theEmployesListStream.add(new Employees("Alan", "Specter", 1900));
        theEmployesListStream.add(new Employees("Ted", "East", 4800));
        theEmployesListStream.add(new Employees("Maria", "Stone", 2100));
        theEmployesListStream.add(new Employees("Amy", "Lake", 3600));
        theEmployesListStream.add(new Employees("Jeff", "Snow", 3300));
        theEmployesListStream.add(new Employees("George", "Green", 4900));
    }

    public List<Employees> getTheEmployesListStream(){
        return new ArrayList<>(theEmployesListStream);
    }

}
