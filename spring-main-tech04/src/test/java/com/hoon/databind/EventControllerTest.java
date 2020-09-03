package com.hoon.databind;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest({EventConverter.StringToEventConverter.class, EventController.class}) //테스트할때 필요한 빈 설정
public class EventControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getEvent() throws Exception{

        mockMvc.perform(get("/event/1"))
                .andExpect(status().isOk())
                .andExpect(content().string("1"));

    }

    @Test
    public void getEventNm() throws Exception{

        mockMvc.perform(get("/event/eventNm/itemNm"))
                .andExpect(status().isOk())
                .andExpect(content().string("itemNm"));

    }

}