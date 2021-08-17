package com.example.simplewebapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping("/")
    public String index(){
        return "hello world!";
    }
}


/*Spring container uses dependency injection (DI) to manage the components that make up anapplication.
* Configuration metadata represents how you as an application developer tell the Spring container to instantiate, configure, and assemble the objects in your application.
* */