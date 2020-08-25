package com.hoon.profile;

import com.hoon.profile.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class EnvironmentRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    BookRepository bookRepository;

    @Value("${app.test}")
    private String appTest;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment environment = applicationContext.getEnvironment();
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        System.out.println(Arrays.toString(environment.getDefaultProfiles())); //어떠한 설정을 하지 않아도 적용

        //프로퍼티 테스트
        System.out.println(environment.getProperty("app.name"));
        System.out.println(environment.getProperty("app.about"));
        System.out.println(appTest);
    }
}
