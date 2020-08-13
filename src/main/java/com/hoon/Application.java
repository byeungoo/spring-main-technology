package com.hoon;

import com.hoon.beanReg.BeanReg;
import com.hoon.beanReg.BeanRegConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanRegConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
        BeanReg beanReg = (BeanReg) applicationContext.getBean("beanReg");
        System.out.println(beanReg.beanRegRepository != null);
    }
}
