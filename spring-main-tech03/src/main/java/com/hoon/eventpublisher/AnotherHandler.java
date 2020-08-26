package com.hoon.eventpublisher;

import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AnotherHandler {

    @EventListener
    //@Order(Ordered.HIGHEST_PRECEDENCE+2)  //동일한 이벤트를 여러개 발생시킬 때 순서를 줄 수 있음
    @Async //비동기로 실행 순서 보장 x, order가 의미없음
    public void handle(MyEvent myEvent){
        System.out.println(Thread.currentThread().toString());
        System.out.println("Another" + myEvent.getData());
    }

}
