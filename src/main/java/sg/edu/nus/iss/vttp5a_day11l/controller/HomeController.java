package sg.edu.nus.iss.vttp5a_day11l.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(
            HomeController.class.getName());

    @ResponseBody
    @GetMapping("/log") // endpoint
    public String home() {
        logger.info("This is an INFO message");
        logger.warn("This is a WARN message");
        logger.error("This is a SEVERE/FATAL message");
        logger.debug("This is a DEBUG message");
        logger.trace("This is a TRACE message");

        return "Log in HomeController...";
    }

    @GetMapping("home")
    public String homePage(){
        return "home";
    }
}
