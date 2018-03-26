/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloud.bus.example.cloudbusdemo.utilities;

import com.cloud.bus.example.cloudbusdemo.model.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Event handler for {@link MyCustomRemoteEvent}
 */
@Component
public class MyCustomRemoteEventListener implements ApplicationListener<MyCustomRemoteEvent> {

    private static final Logger logger = LoggerFactory.getLogger(MyCustomRemoteEventListener.class);

    @Override
    public void onApplicationEvent(MyCustomRemoteEvent myCustomRemoteEvent) {
        logger.info("Received MyCustomRemoteEvent - message: " + myCustomRemoteEvent.getMessage());
        if (myCustomRemoteEvent.getMessage().toString().contains("change value")) {
            Singleton sng = Singleton.getInstance();
            sng.setS("This thing works");
            System.out.println("new value set from listener" + sng.getInstance().s);
        }
    }
}
