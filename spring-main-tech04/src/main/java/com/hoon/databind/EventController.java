package com.hoon.databind;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @InitBinder //컨트롤러에서 사용할 바인더 등록
    public void init(WebDataBinder webDataBinder){  //데이터 바인더의 구현체 중 하나
        webDataBinder.registerCustomEditor(Event.class, new EventEditor());
    }

    @GetMapping("/event/{event}")
    public String getEvent(@PathVariable Event event){
        System.out.println(event);
        return event.getId().toString();
    }

    @GetMapping("/event/eventNm/{eventNm}")
    public String getEvent(@PathVariable String eventNm){   //스프링이 기본적으로 컨버터를 등록하지 않아도 String, Integer 이런거는 자동으로 변환해줌.
        System.out.println(eventNm);
        return eventNm;
    }

}
