package com.hoon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.nio.file.Files;

@Component
public class ResourceAppRunner implements ApplicationRunner {

    @Autowired
    ResourceLoader resourceLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Resource resource = resourceLoader.getResource("classpath:test.txt"); // target/classes가 classpath root임. 이 아래로 파일을 찾게됩니다.
        System.out.println(resource.exists());
        System.out.println(resource.getDescription());

        Resource resource2 = resourceLoader.getResource("classpath:/static/test2.txt");
        System.out.println(resource2.exists());
    }
}
