package Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        List<Employees> employeesWithinRange = new ArrayList<>();

        employeesWithinRange = company.getAllEmployeesWithinRange();
        System.out.println("Employees meeting the salary criteria: " + employeesWithinRange);

       CompanyStream companyStream = new CompanyStream();
       List<Employees> employeesWithinRangeStream = companyStream.getTheEmployesListStream().stream()
               .filter(salary -> salary.getSalary() >= 2000)
               .filter(salary -> salary.getSalary() <= 3000)
               .collect(Collectors.toList());

        System.out.println("List filtered using stream():");

       employeesWithinRangeStream.stream()
               .forEach(System.out::println);
    }
}

