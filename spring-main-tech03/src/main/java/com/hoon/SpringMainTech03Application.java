package com.hoon;

import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync //@Async 사용하기 위해서 사용
public class SpringMainTech03Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringMainTech03Application.class, args);
    }

    @Bean
    public MessageSource messageSource(){       //릴로딩 기능이 있는 메시지 소스 사용하기
        var messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:/messages");
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setCacheSeconds(3); //최대 3초동안 캐싱
        return messageSource;
    }

}
