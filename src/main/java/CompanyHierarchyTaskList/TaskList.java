package CompanyHierarchyTaskList;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<Tasks> taskLists = new ArrayList<>();

    public TaskList(){
        taskLists.add(new Tasks("report running", 'C'));
        taskLists.add(new Tasks("report analysis", 'B'));
        taskLists.add(new Tasks("conducting the meeting", 'A'));
        taskLists.add(new Tasks("forecast preparation", 'B'));
        taskLists.add(new Tasks("conducting interview", 'A'));
        taskLists.add(new Tasks("scanning docs", 'C'));
        taskLists.add(new Tasks("data consolidation", 'A'));
    }


}
