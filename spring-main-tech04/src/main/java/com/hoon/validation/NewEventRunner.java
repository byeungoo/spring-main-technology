package com.hoon.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import java.util.Arrays;


@Component
public class NewEventRunner implements ApplicationRunner {

    @Autowired
    LocalValidatorFactoryBean validatorFactoryBean;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(validatorFactoryBean.getClass());

        Event event = new Event();
        event.setLimit(-1);
        event.setEmail("testsdfd");
        Errors errors = new BeanPropertyBindingResult(event, "event");  //Errors 타입의 구현체는 볼 일이 별로없음. spring mvc에서 자동으로 생성해서 제공

        validatorFactoryBean.validate(event, errors);

        System.out.println(errors.hasErrors());

        errors.getAllErrors().forEach(e -> {
            System.out.println("==== error code ====");
            Arrays.stream(e.getCodes()).forEach(System.out::println);
            System.out.println(e.getDefaultMessage());
        });
    }
}
