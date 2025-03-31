package Model;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Server implements Runnable {
    protected BlockingQueue<Task> tasks;
    public AtomicInteger waitingPeriod;

    public Server() {
        this.tasks = new LinkedBlockingQueue<>();
        this.waitingPeriod = new AtomicInteger(0);
    }
    public void addTask(Task task) {
        this.tasks.add(task);
        //mai tb sa ma ocup de waiting period
    }

    public void run(){

    }

}
