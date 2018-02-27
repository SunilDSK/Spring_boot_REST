package com.sunilkumar.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String sayHi(){
        return "Hi this is simple <b>Sprint boot app</b>";
    }
}
