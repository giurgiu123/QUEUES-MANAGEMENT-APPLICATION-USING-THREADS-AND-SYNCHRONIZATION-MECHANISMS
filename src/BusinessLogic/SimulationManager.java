package BusinessLogic;

import GUI.SimulationFrame;
import Model.Task;

import java.util.ArrayList;
import java.util.List;

public class SimulationManager {
    //data read from UI
    public int timeLimit = 100; // maxprocessing time - read from UI
    public int maxProcessingTime = 10;
    public int minProcessingTime = 2;
    public int numberOfServers = 3;
    public int numberOfClients = 100;
    private Scheduler scheduler;
    protected SimulationFrame frame;
    protected List<Task> generatedTasks;
    public SelectionPolicy selectionPolicy=SelectionPolicy.SHORTEST_TIME;

    public SimulationManager() {
        // Initialize the scheduler
        scheduler = new Scheduler(numberOfServers, numberOfServers, selectionPolicy);

        // Initialize frame to display simulation
        frame = new SimulationFrame();

        // Generate numberOfClients clients using generateNRandomTasks()
        generatedTasks = new ArrayList<>();
        generateNRandomTasks();
    }

    public void generateNRandomTasks() {

    }
}
