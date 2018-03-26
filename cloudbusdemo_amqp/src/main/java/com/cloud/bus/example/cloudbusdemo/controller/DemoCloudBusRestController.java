package com.cloud.bus.example.cloudbusdemo.controller;

import com.cloud.bus.example.cloudbusdemo.model.Singleton;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class DemoCloudBusRestController {    

    @RequestMapping(value = "/get-singleton-value", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody
    Object updateSingleton(HttpServletRequest request) {

        return "Value of field in Singleton class: " + Singleton.getInstance().s;

    }

    
}
