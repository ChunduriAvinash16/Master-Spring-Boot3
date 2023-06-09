package com.learn.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

    private Logger log = LoggerFactory.getLogger(getClass());
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String gotoWlcomePage(ModelMap map) {
        map.put("name",getLoggedinUsername());
        return "welcome";
    }
    private String getLoggedinUsername() {
        return SecurityContextHolder.getContext().
                getAuthentication().getName().toString();
    }
}
