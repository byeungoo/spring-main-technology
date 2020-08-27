package com.hoon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.nio.file.Files;

@Component
public class ResourceAppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext resourceLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(resourceLoader.getClass()); //WebApplicationContext

        Resource resource = resourceLoader.getResource("classpath:test.txt"); // target/classes가 classpath root임. 이 아래로 파일을 찾게됩니다.
        System.out.println(resource.getClass()); //접두어 classpath를 썼기 때문에 ClassPathResource가 나옴.
        System.out.println(resource.exists());
        System.out.println(resource.getDescription());

        Resource resource2 = resourceLoader.getResource("/static/test2.txt");
        System.out.println(resource2.getClass()); //접두어를 안붙였기 때문에 기본적으로 ServletContextResource가 나옴
        System.out.println(resource2.exists());

        Resource resource3 = resourceLoader.getResource("test3.txt");
        System.out.println(resource3.getClass()); //접두어를 안붙였기 때문에 기본적으로 ServletContextResource가 나옴
        System.out.println(resource3.exists());
    }
}
