package com.hoon.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile("test")    //test profile일 때만 적용되는 빈설정 파일
//@Profile("!prod")  //prod가 아닌 경우 등록해라도 가능
//@Profile("!prod & test")  //요런 조합도 가능
@Profile("test | prod") // or 조건도 가능
public class TestConfiguration {

    @Bean
    public BookRepository bookRepository(){
        return new TestBookRepository();
    }

}
