package com.hoon.beanReg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanReg {

    @Autowired
    public BeanRegRepository beanRegRepository;

    public void setBeanRegRepository(BeanRegRepository beanRegRepository){
        this.beanRegRepository = beanRegRepository;
    }

}
