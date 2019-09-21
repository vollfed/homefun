package controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class  KinectController {

    static final Logger logger = LogManager.getLogger(KinectController.class.getName());

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {

        String strHello = "\"This is greetings\"+ (KinectController.class.getName()";
        logger.info(strHello);
        System.out.println(strHello);

        model.addAttribute("name", name);

        //the same as html name in resourse folder
        return "greeting";
    }

}
