package test.home.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import static org.apache.tomcat.jni.Time.sleep;

@Service
public class AsynchronousService {

    static final Logger logger = LogManager.getLogger(AsynchronousService.class.getName());

    @Autowired
    private TaskExecutor taskExecutor;

    @Async
    public void executeAsynchronously() {
        taskExecutor.execute(new Runnable() {
            @Override
            public void run() {
                logger.info("Going to sleep....");
                for(int i = 0; i < 1000000 ; i++){
                    if(i%1000 ==0)
                    logger.debug(i);
                    //sleep(3000);
                }
                logger.info("Had great sleep right there!");
            }
        });
    }



}
