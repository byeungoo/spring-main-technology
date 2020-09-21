package com.hoon.springaop;

import org.springframework.stereotype.Service;

@Service
public class SimpleAopEventService implements AopEventService{

    @Override
    @PerLoggin
    public void createEvent() {
        try {
            Thread.sleep(1000);
            System.out.println("Created an Aop event");
        } catch(InterruptedException e){
            e.printStackTrace();
        }

    }

    @Override
    @PerLoggin
    public void publishEvent() {
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Published an Aop event");
    }

    public void deleteEvent(){
        System.out.println("Delete an Aop event");
    }
}
