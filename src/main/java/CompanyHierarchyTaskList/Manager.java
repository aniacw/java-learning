package CompanyHierarchyTaskList;

public class Manager implements Employee {

    public String doTask(Tasks tasks){
        if(tasks.getTaskGrade()=='A'){
            System.out.println("I'll take care of it");
        }else {
            System.out.println("I'll get somebody do it");
        }
        return null;
    }
}
