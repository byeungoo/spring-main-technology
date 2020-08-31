package com.hoon.databind;

import java.beans.PropertyEditorSupport;

public class EventEditor extends PropertyEditorSupport {    //절대로 Bean으로 등록해서 사용하면 안됨

    @Override
    public String getAsText() {
        Event event = (Event)getValue();
        return event.getId().toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new Event(Integer.parseInt(text)));
    }
}
