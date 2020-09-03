package com.hoon.databind;

import org.springframework.core.convert.converter.Converter;

public class EventConverter {

    //String을 이벤트로 변환
    public static class StringToEventConverter implements Converter<String, Event> {
        @Override
        public Event convert(String s) {
            return new Event(Integer.parseInt(s));
        }
    }

    //이벤트를 String 변환
    public static class EventToStringConverter implements Converter<Event, String>{
        @Override
        public String convert(Event event) {
            return event.getId().toString();
        }
    }

}
