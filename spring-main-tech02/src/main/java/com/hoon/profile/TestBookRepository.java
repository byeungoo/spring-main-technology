package com.hoon.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("test") //테스트에서 사용할 repository로 정의 가능
public class TestBookRepository implements BookRepository {
}
