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

    public boolean isSalaryWithinRange(){
        boolean result = false;
        for (Employees employeeFound: theEmployesList) {
            if (employeeFound.getSalary() <= 2000 && employeeFound.getSalary() >= 3000){
                result = true;
                System.out.println("Salary of " + employeeFound.getEmployeeName() + " " + employeeFound.getEmployeeSurname() + " is within range");
            }else {
                System.out.println("Salary of " + employeeFound.getEmployeeName() + " " + employeeFound.getEmployeeSurname() + " is not within the range");
            }
        }
        return result;
    }

}
