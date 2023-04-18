package com.spring.core.chap03.config;

import com.spring.core.chap03.Hotel;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class HotelConfigTest {
    AnnotationConfigApplicationContext ac=
    new AnnotationConfigApplicationContext(HotelConfig.class);

    @Test
    void springDITest(){
        //스프링의 컨테이너에서 등록된 객체를 가져오기
        Hotel hotel = ac.getBean(Hotel.class);
        hotel.inform();

    }

}