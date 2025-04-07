package BusinessLogic;

import Model.Server;
import Model.Task;

import java.util.List;

public class ConcreteStrategyQueue implements Strategy {

    public void addTask(List<Server> servers, Task task){
        int minQueueSize = Integer.MAX_VALUE;//sau cu Integer.MAX_VALUE
        Server targetServer = null;
        for(Server server : servers){
            int queueSize=server.getTasks().length;
            if(queueSize<minQueueSize){
                targetServer=server;
                minQueueSize=queueSize;//sa puna la cea mai mica coada
            }
        }
        if(targetServer!=null) {
            targetServer.addTask(task);
        }
    }

}
