package com.spring.core.person;

import org.junit.jupiter.api.Test;

class PersonTest {
    // 테스트 메서드 생성
    @Test
    void lombokTest() {
        Person p = new Person();
        p.setAddress("seoul");
        p.setAge(10);
        p.setNiceName("mike");

        System.out.println(p);
    }
}