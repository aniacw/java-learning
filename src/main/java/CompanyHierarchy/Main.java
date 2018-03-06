package CompanyHierarchy;

public class Main {
    public static void main(String[] args){

        Specialist specialist = new Specialist();
        Manager manager = new Manager();

        String specialistResult = specialist.doTask();
        System.out.println(specialistResult);

        String managerResult = manager.doTask();
        System.out.println(managerResult);
    }
}
