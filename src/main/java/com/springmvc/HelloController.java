package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author 14792
 */
@Controller
@RequestMapping("/hello")
public class HelloController{
    private static final Logger logger = Logger.getLogger("HelloController");
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        logger.log(Level.INFO, "message from /hello");
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "/hello";
    }
}
