package BusinessLogic;

import Model.Server;
import Model.Task;

import java.util.List;

public class Scheduler {
    protected List<Server> servers;
    protected int maxNoServers;
    protected int maxTasksPerServer;
    protected Strategy strategy;

    public void changeStrategy(SelectionPolicy selectionPolicy) {


    }
    public void dispatchTask(Task task) {

    }
}
