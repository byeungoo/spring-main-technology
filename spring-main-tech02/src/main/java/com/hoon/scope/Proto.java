package com.hoon.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS) //빈을 받아올때 마다 새로운 인스턴스. 클래스 기반의 프록시로 감싸라. 감싸는 프록시 빈을 사용하게함
                                                                      //매번 바꿀 수 있도록 프록시 라이브러리로 감싸줌
public class Proto {
}
