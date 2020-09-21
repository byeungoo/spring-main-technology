package com.hoon.springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect //Aspect 클래스임을 알려줌
@Component  //빈으로 등록해줌
public class PerfAspect {

    //@Around("execution(* com.hoon.springaop..*.*(..))") //어디에 적용할지. 저렇게 하면 저 아래 모든 패키지의 모든 메소드에 적용됨
    @Around("@annotation(PerLoggin)")
    //@Around("bean(simpleAopEventService)") //그 빈이 가지고 있는 모든 public 메소드에 적용
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable{ //pjp -> Advice가 적용되는 대상.
        long begin = System.currentTimeMillis();           //advice 정의
        Object retVal = pjp.proceed();
        System.out.println(System.currentTimeMillis() - begin);
        return retVal;
   }

   @Before("bean(simpleAopEventService)") //어떤 메소드가 실행되기 이전에 무언가를 하고 싶을 때
   public void hello(){
       System.out.println("hello");
   }

}
