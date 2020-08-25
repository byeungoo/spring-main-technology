package com.hoon.messagesource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MessageSourceRunner implements ApplicationRunner {

    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        while (true){       //찍히는 와중에 messages 프로퍼티 수정후 빌드하면 앱이 실행되는 도중에 수정된 값을 찍어줌
            System.out.println(messageSource.getMessage("greeting", new String[]{"hoon"}, Locale.KOREA));
            System.out.println(messageSource.getMessage("greeting", new String[]{"hoon"}, Locale.US));
            System.out.println(messageSource.getMessage("greeting", new String[]{"hoon"}, Locale.getDefault()));
            Thread.sleep(1000L);
        }

    }

}
