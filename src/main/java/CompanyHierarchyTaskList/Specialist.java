package CompanyHierarchyTaskList;

public class Specialist implements Employee{

    public String doTask(Tasks tasks) {
        if(tasks.getTaskGrade()=='B') {
            System.out.println("I'll handle it");
        }else if(tasks.getTaskGrade()=='C'){
            System.out.println("I'll forward it to my manager");
        }else {
            System.out.println("I'll get an intern do it");
        }
        return null;
    }
}
