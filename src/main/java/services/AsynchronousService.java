package services;

import org.apache.catalina.core.ApplicationContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.Async;

import static org.apache.tomcat.jni.Time.sleep;

public class AsynchronousService {

    static final Logger logger = LogManager.getLogger(AsynchronousService.class.getName());

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private TaskExecutor taskExecutor;

    /*
    public void executeAsynchronously() {
        taskExecutor.execute(new Runnable() {
            @Override
            public void run() {
                //TODO add long running task
            }

        });
    }
    */
    @Async
    public void executeAsynchronously(){
        for(int i = 0; i < 10 ; i++){
            logger.debug(i);
            sleep(3000);
        }
        logger.info("Had great sleep right there!");
    }


}
