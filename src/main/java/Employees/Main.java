package Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        List<Employees> employeesWithinRange = company.getAllEmployeesWithinRange(2000, 3000);

        System.out.println("Employees meeting the salary criteria: " + employeesWithinRange);

       CompanyStream companyStream = new CompanyStream();
       List<Employees> employeesWithinRangeStream = companyStream.getTheEmployesListStream(3000, 4000);

        System.out.println("List filtered using stream():");

       employeesWithinRangeStream.stream()
               .forEach(System.out::println);
    }
}

