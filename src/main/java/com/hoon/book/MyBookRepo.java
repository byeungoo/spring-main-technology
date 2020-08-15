package com.hoon.book;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary //여러개의 동일한 빈을 주입할 때 이 녀석을 주입하도록 마킹. 이 방법 추천
public class MyBookRepo  implements BookRepo{
}
