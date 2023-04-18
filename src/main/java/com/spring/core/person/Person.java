package com.spring.core.person;

import lombok.*;

@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor  // 기본생성자
@AllArgsConstructor // 모든 파라미터 생성자
//Data - 한방에 해줌. 실무에선 사용 X
public class Person {

    private String niceName;
    private int age;
    private String address;
}
