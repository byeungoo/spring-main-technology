package com.hoon.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EventRunner implements ApplicationRunner {

    @Autowired
    EventService eventService;  //인터페이스가 있는 경우에는 인터페이스 타입으로 주입 받는게 좋음

    @Override
    public void run(ApplicationArguments args) throws Exception {

        //클라이언트 코드
        eventService.createEvent();
        eventService.publishEvent();
        eventService.deleteEvent();
    }

}
