package test.home.thread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ThreadPrototype implements Runnable {

        static final Logger logger = LogManager.getLogger(ThreadPrototype.class.getName());

        @Override
        public void run() {
            logger.info("Called from test.home.thread");
        }


}
