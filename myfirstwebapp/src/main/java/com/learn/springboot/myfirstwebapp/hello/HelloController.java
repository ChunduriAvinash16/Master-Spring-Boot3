package com.learn.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController
{
    @RequestMapping("/say-hello")
    @ResponseBody
    public String getHello() {
        return "Hello World";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String getHelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> First Page </title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>Hello from HTML!!!</h1>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    @RequestMapping("say-hello-jsp")
    public String getHellojsp() {
        return "sayHello";
    }
}
