package BusinessLogic;

import Model.Server;
import Model.Task;

import java.util.ArrayList;

import java.util.List;

public class Scheduler {

    protected List<Server> servers;
    protected int maxNoServers;
    protected int maxTasksPerServer;
    protected Strategy strategy;
    private SelectionPolicy selectionPolicy;

    public Scheduler(int maxNoServers, int maxTasksPerServer, SelectionPolicy selectionPolicy) {
        this.maxNoServers = maxNoServers;
        this.maxTasksPerServer = maxTasksPerServer;
        this.selectionPolicy = selectionPolicy;
        this.servers = new ArrayList<>();

        for (int i = 0; i < maxNoServers; i++) {
            Server server = new Server();
            servers.add(server);
            Thread serverThread = new Thread(server);
            serverThread.start(); //TODO thread pull
        }

    }
    public void changeStrategy(SelectionPolicy selectionPolicy) {
            if(selectionPolicy==SelectionPolicy.SHORTEST_QUEUE){
                strategy= new ConcreteStrategyQueue();

            }
            if(selectionPolicy==SelectionPolicy.SHORTEST_TIME) {
                strategy= new ConcreteStrategyTime();
            }

    }
    public void dispatchTask(Task task) {
            if(strategy!=null) {
                strategy.addTask(servers, task);
            }
    }
    public List<Server> getServers() {
        return servers;
    }
}
