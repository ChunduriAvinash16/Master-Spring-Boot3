package com.learn.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        super();
        this.authenticationService = authenticationService;
    }

    private Logger log = LoggerFactory.getLogger(getClass());
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLoginPage() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotoWelcomeage(@RequestParam String name,@RequestParam String password,ModelMap model) {
        if(authenticationService.authenticate(name,password)) {
            model.put("name", name);
            return "welcome";
        }

        model.put("error","Invalid Credentials ! Try Again!!!");
        return  "login";
    }
}
