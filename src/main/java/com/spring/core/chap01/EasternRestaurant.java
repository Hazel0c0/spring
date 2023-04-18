package com.spring.core.chap01;

public class EasternRestaurant {
    //쉐프
    private JannChef chef=new JannChef();

    // 요리 코스
    private FrenchCourse course= new FrenchCourse();

    //요리를 주문하나ㅡㄴ 기능
    public void order(){
        System.out.println("서양 요리를 주문합니다.");
        course.combineMenu();
        chef.cook();
    }

}
