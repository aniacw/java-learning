package CompanyHierarchyTaskList;

public class Intern implements Employee {

    public String doTask(Tasks tasks){
        if(tasks.getTaskGrade()=='C'){
            System.out.println("I'll do it");
        } else{
            System.out.println("I'll ask my buddy what to do");
        }
        return null;
    }
}
