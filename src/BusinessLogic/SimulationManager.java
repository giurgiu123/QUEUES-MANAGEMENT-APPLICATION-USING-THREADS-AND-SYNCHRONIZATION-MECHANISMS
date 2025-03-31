package BusinessLogic;

import GUI.SimulationFrame;
import Model.Task;

import java.util.ArrayList;
import java.util.List;

public class SimulationManager {
    protected Scheduler scheduler;
    protected SimulationFrame frame;
    protected List<Task> tasks;
    protected SelectionPolicy selectionPolicy;

    public SimulationManager(SimulationFrame frame, Scheduler scheduler, SelectionPolicy selectionPolicy) {
        this.frame = frame;
        this.scheduler = scheduler;
        this.selectionPolicy = selectionPolicy;
        this.tasks = new ArrayList<>();

    }
    public void generateRandomTasks() {

    }
}
