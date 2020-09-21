package com.hoon.aop;

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService {

    @Override
    public void createEvent() {
        try {
            Thread.sleep(1000);
            System.out.println("Created an event");
        } catch(InterruptedException e){
            e.printStackTrace();
        }

    }

    @Override
    public void publishEvent() {
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Published an event");
    }

    public void deleteEvent(){
        System.out.println("Delete an event");
    }
}
