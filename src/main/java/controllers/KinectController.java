package controllers;

import enums.ProcessingCommand;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.AsynchronousService;
import services.ProcessingCommandService;


@Controller
public class  KinectController {

    static final Logger logger = LogManager.getLogger(KinectController.class.getName());

    @Autowired
    ProcessingCommandService commandService;

    @Autowired
    AsynchronousService asynchService;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {

        String strHello = "This is greetings";
        logger.info(strHello);
        System.out.println(strHello);

        model.addAttribute("name", name);

        //the same as html name in resourse folder
        return "greeting";
    }

    @GetMapping("/menu")
    public String menu(Model model) {
        model.addAttribute("message", "message");

        String strHello = "This is menu";
        logger.info(strHello);
        System.out.println(strHello);

        //the same as html name in resourse folder
        return "menu";
    }

    @GetMapping("/kinect")
    public String kinect(@RequestParam(name="command", required=false, defaultValue="start") String commandName, Model model) {

        String strHello = "This is kinect command: "+ commandName;
        logger.info(strHello);
        System.out.println(strHello);

        ProcessingCommand command = ProcessingCommand.getCommand(commandName);
        commandService.processCurrentCommand(command);

        asynchService.executeAsynchronously();

        model.addAttribute("command", command.getCommandName());
        //the same as html name in resourse folder
        return "kinect";
    }

}
