package Employees;

import java.util.ArrayList;
import java.util.List;

public class Company {

    List<Employees> theEmployesList = new ArrayList<>();

    public Company(){
        theEmployesList.add(new Employees("John", "West", 5000));
        theEmployesList.add(new Employees("Thomas", "Allen", 2500));
        theEmployesList.add(new Employees("Eric", "Smoak", 3100));
        theEmployesList.add(new Employees("Kate", "Palmer", 2700));
        theEmployesList.add(new Employees("Jenny", "Pearson", 6500));
        theEmployesList.add(new Employees("Alan", "Specter", 1900));
        theEmployesList.add(new Employees("Ted", "East", 4800));
        theEmployesList.add(new Employees("Maria", "Stone", 2100));
        theEmployesList.add(new Employees("Amy", "Lake", 3600));
        theEmployesList.add(new Employees("Jeff", "Snow", 3300));
        theEmployesList.add(new Employees("George", "Green", 4900));
    }



    public List<Employees> getAllEmployeesWithinRange(int bottomRange, int upperRange){
        List<Employees> employeesWithinRangeHelpList = new ArrayList<>();
        for (Employees employeeFound: theEmployesList) {
            if (employeeFound.getSalary() >= bottomRange && employeeFound.getSalary() <= upperRange){
                employeesWithinRangeHelpList.add(employeeFound);
                System.out.println("Salary of " + employeeFound.getEmployeeName() + " " + employeeFound.getEmployeeSurname() + " is within range");//dlaczego to sie nie drukuje?
            }else {
                System.out.println("Salary of " + employeeFound.getEmployeeName() + " " + employeeFound.getEmployeeSurname() + " is not within the range");
            }
        }
        return employeesWithinRangeHelpList;
    }
}
