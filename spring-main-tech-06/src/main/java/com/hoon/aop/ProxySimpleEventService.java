package com.hoon.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary   //같은 타입의 빈이 있다면 그 중 한개 선택
@Service
public class ProxySimpleEventService implements EventService{  //AOP로 감싸는 클래스와 같은 인터페이스를 구현해야함

    @Autowired
    EventService simpleEventService;

    @Override
    public void createEvent() {
        long begin = System.currentTimeMillis();
        simpleEventService.createEvent();
        System.out.println(System.currentTimeMillis() - begin);
    }

    @Override
    public void publishEvent() {
        long begin = System.currentTimeMillis();
        simpleEventService.publishEvent();
        System.out.println(System.currentTimeMillis() - begin);
    }

    @Override
    public void deleteEvent() {
        simpleEventService.deleteEvent();
    }
}
