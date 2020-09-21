package com.hoon.springaop;

import java.lang.annotation.*;
/*
 * 이 어노테이션을 사용하면성능을 로깅해 줍니다.
 */
@Retention(RetentionPolicy.CLASS) //이 어노테이션 정보를 어디까지 유지할꺼인지. default가 class임. 구지 런타임까지도 필요없고 기본값으로 해도 됨. source로 하면 컴파일하면 사라짐. class 이상 줌
@Documented  //java doc 만들 때
@Target(ElementType.METHOD) //타겟은 method 라고 명시하는거 정도는 괜찮음
public @interface PerLoggin {
}
