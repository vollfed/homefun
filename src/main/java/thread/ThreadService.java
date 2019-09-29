package thread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadService  extends Thread {
        static final Logger logger = LogManager.getLogger(ThreadService.class.getName());

        private String message;

        // standard logger, constructor

        @Override
        public void run() {
            logger.info(message);
        }
}
