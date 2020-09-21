package com.hoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMainTech06Application {

    public static void main(String[] args) {
        //자바 main 실행하듯이 변경
        SpringApplication app = new SpringApplication(SpringMainTech06Application.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

}
