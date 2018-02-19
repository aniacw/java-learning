package Employees;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employees> theEmployeesList = new ArrayList<>();
        Employees employee1 = new Employees("John", "West", 5000);
        Employees employee2 = new Employees("Thomas", "Allen", 2500);
        Employees employee3 = new Employees("Eric", "Smoak", 3100);
        Employees employee4 = new Employees("Kate", "Palmer", 2700);
        Employees employee5 = new Employees("Jenny", "Pearson", 6500);
        Employees employee6 = new Employees("Alan", "Specter", 1900);
        Employees employee7 = new Employees("Ted", "East", 4800);
        Employees employee8 = new Employees("Maria", "Stone", 2100);
        Employees employee9 = new Employees("Amy", "Lake", 3600);
        Employees employee10 = new Employees("Jeff", "Snow", 3300);
        Employees employee11 = new Employees("George", "Green", 4900);

        theEmployeesList.add(employee1);
        theEmployeesList.add(employee2);
        theEmployeesList.add(employee3);
        theEmployeesList.add(employee4);
        theEmployeesList.add(employee5);
        theEmployeesList.add(employee6);
        theEmployeesList.add(employee7);
        theEmployeesList.add(employee8);
        theEmployeesList.add(employee9);
        theEmployeesList.add(employee10);
        theEmployeesList.add(employee11);


//        Employees employee = new Employees("John", "West", 5000);
//        String employeeFound = employee.isSalaryWithinRange(2000, 3000);
//        System.out.println(employeeFound);

 //       Employees theList = new Employees(theEmployeesList);


    public boolean isSalaryWithinRange(){
        boolean result = false;
            for (Employees employeeFound: theEmployeesList) {
                if (employeeFound.getSalary() <= 2000 && employeeFound.getSalary() >= 3000){
                     result = true;
                System.out.println(result);
                }else {
                    System.out.println("Salary of " + employeeFound + " is not within the range");
                }
            }
            return result;
    }
    }
}

