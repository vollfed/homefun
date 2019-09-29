package test.home.services;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import test.home.enums.ProcessingCommand;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class ProcessingCommandService {
    static final Logger logger = LogManager.getLogger(ProcessingCommandService.class.getName());

    public void processCurrentCommand(ProcessingCommand command) {

    }

}
