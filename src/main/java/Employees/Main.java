package Employees;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();
        boolean checkSalaryRange = false;

        checkSalaryRange = company.isSalaryWithinRange();
        System.out.println(checkSalaryRange);
    }
}

