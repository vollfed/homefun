package test.home.processing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StartKinect {

    static final Logger logger = LogManager.getLogger(StartKinect.class.getName());

    public static void start(String[] args) {

        StartKinect obj = new StartKinect();
        obj.runMe("mkyong");

    }

    private void runMe(String parameter){

        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + parameter);
        }

        logger.info("This is info : " + parameter);
        logger.debug("This is debug : " + parameter);
        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + logger.isDebugEnabled());
        logger.fatal("This is fatal : " + parameter);
        logger.error("This is error  : " + logger.isInfoEnabled());
    }
}
