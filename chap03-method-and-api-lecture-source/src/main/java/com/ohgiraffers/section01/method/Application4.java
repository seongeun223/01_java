package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {

        /* 여러 개의 전달인자를 이용한 메소드의 호출 테스트*/
        Application4 app4 = new Application4();

        String name = "박성은";
        int age = 24;
        char gender = '여';

        app4.testmethod(name, age, gender);
    }

    // "당신의 이름은 ~이고, 나이는 ~이며, 성별은 ~입니다."
    public void testmethod(String name, int age, final char gender) {

        System.out.println("당신의 이름은 " + name + "이고 나이는 " + age + "세 이며, 성별은 " + gender + "입니다.");
    }
}
