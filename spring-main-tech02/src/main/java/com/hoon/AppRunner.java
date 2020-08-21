package com.hoon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    Single single;

    @Autowired
    Proto proto;

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        //매번 다른 인스턴스가 찍힘
        System.out.println("proto");
        System.out.println(single.getProto());
        System.out.println(applicationContext.getBean(Proto.class));
        System.out.println(applicationContext.getBean(Proto.class));
        System.out.println(applicationContext.getBean(Proto.class));

        //매번 같은 인스턴스가 찍힘
        System.out.println("single");
        System.out.println(single);
        System.out.println(single);
        System.out.println(single);

        //싱글톤빈이 프로토타입을 참조하면 업데이트가 안되고 같은 객체
        System.out.println("proto by single");
        System.out.println(single.getProto());
        System.out.println(single.getProto());
        System.out.println(single.getProto());
    }
}
