package BusinessLogic;

import GUI.SimulationFrame;
import Model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
    public void setNumberOfServers(int numberOfServers) {
        this.numberOfServers = numberOfServers;

    }
    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
    }
    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }
    public void setMinProcessingTime(SelectionPolicy selectionPolicy) {
        this.selectionPolicy = selectionPolicy;
    }
    public void setMaxProcessingTime(int maxProcessingTime) {
        this.maxProcessingTime = maxProcessingTime;
    }

    public List<Task> getGeneratedTasks() {
        return generatedTasks;
    }

    public void generateNRandomTasks() {
        Random random = new Random();
        for (int i = 1; i <= numberOfClients; i++) {
            int arrivalTime = random.nextInt(maxProcessingTime-minProcessingTime) + minProcessingTime;
            int serviceTime = random.nextInt(maxProcessingTime-minProcessingTime) + minProcessingTime;
            Task task= new Task(i,arrivalTime,serviceTime);
            generatedTasks.add(task);//adaugam in lista
        }

    }
}
