package com.hoon.eventpublisher;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler{

    @EventListener
    //@Order(Ordered.HIGHEST_PRECEDENCE)
    @Async //비동기로 실행 순서 보장 x, order가 의미없음
    public void handle(MyEvent myEvent) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("이벤트 받았다. 데이터는 " + myEvent.getData());
    }

    @EventListener
    @Async
    public void handle(ContextRefreshedEvent event){
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextClosedEvent");
    }

    @EventListener
    @Async
    public void handle(ContextClosedEvent event){
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextClosedEvent");
    }

}
