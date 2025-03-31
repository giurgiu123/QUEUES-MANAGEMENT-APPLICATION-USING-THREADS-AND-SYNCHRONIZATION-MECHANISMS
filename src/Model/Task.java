package Model;

public class Task {
    protected int idTask;
    protected int arrivalTime;
    protected int serviceTime;
    //eventual sa mai adaug waiting time aici ca e dependent de task
    public Task(int idTask, int arrivalTime, int serviceTime) {
        this.idTask = idTask;
        this.arrivalTime = arrivalTime;
        this.serviceTime = serviceTime;
    }
    public int getIdTask() {
        return idTask;
    }
    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }
    public int getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public int getServiceTime() {
        return serviceTime;
    }
    public void setServiceTime(int serviceTime) {
        this.serviceTime = serviceTime;
    }

}
