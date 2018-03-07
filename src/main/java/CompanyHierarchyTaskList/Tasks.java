package CompanyHierarchyTaskList;

public class Tasks {

    private String taskName;
    private char taskGrade;

    public Tasks(String taskName, char taskGrade) {
        this.taskName = taskName;
        this.taskGrade = taskGrade;
    }

    public String getTaskName(){
        return taskName;
    }

    public char getTaskGrade() {
        return taskGrade;
    }
}
