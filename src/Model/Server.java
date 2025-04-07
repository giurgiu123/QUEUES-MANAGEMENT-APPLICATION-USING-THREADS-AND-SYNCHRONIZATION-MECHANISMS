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
    public void addTask(Task newTask) {
        this.tasks.add(newTask);
        waitingPeriod.addAndGet(newTask.getServiceTime());

    }


    public void run(){
        while(true) {
            try {
                Task t = tasks.take();
                for (int i = 0; i < t.getServiceTime(); i++) {
                    Thread.sleep(1000);
                }
                waitingPeriod.addAndGet(-t.getServiceTime());// cu 1 trebuie decrementat



            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public Task[] getTasks() {

        return tasks.toArray(new Task[0]);
    }




}
