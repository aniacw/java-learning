package CompanyHierarchyTaskList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Intern intern = new Intern();
        Specialist specialist = new Specialist();
        Manager manager = new Manager();

        Tasks task1 = new Tasks("report running", 'C');
        Tasks task2 = new Tasks("report analysis", 'B');
        Tasks task3 = new Tasks("conducting the meeting", 'A');
        Tasks task4 = new Tasks("forecast preparation", 'B');
        Tasks task5 = new Tasks("conducting interview", 'A');
        Tasks task6 = new Tasks("scanning docs", 'C');
        Tasks task7 = new Tasks("data consolidation", 'A');

        List<Tasks> taskLists = new ArrayList<>();
        taskLists.add(task1);
        taskLists.add(task2);
        taskLists.add(task3);
        taskLists.add(task4);
        taskLists.add(task5);
        taskLists.add(task6);
        taskLists.add(task7);

        for(int i = 0; i < taskLists.size(); i++){
            System.out.println("Intern's response upon receiving the following task: " + taskLists.get(i).getTaskName());
            String isTaskForIntern = intern.doTask(taskLists.get(i));
            System.out.println("Specialist's response upon receiving the following task: " + taskLists.get(i).getTaskName());
            String isTaskForSpecialist = specialist.doTask(taskLists.get(i));
            System.out.println("Manager's response upon receiving the following task: " + taskLists.get(i).getTaskName());
            String isTaskForManager = manager.doTask(taskLists.get(i));
        }
    }
}
