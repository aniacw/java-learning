package Employees;

public class Employees {
    private String employeeName;
    private String employeeSurname;
    private int salary;
    private int lowerBand;
    private int upperBand;

    public Employees(String employeeName, String employeeSurname, int salary) {
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeSurname='" + employeeSurname + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

//    public String isSalaryWithinRange(int lowerBand, int upperBand){
//        if(salary >= lowerBand && salary <= upperBand){
//
//        }
//        return employeeName + " " + employeeSurname;
//    }
}
