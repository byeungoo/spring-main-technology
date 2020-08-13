package com.hoon.beanReg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackageClasses = Application.class)  스프링에서 가장 기본으로 사용하는 방법 밑에 처럼 Bean으로 직접 등록하면 일일이 해야해서 불편
public class BeanRegConfig {

    @Bean
    public BeanReg beanReg(){
        return new BeanReg();
    }

    @Bean
    public BeanRegRepository beanRegRepository(){
        return new BeanRegRepository();
    }

}
