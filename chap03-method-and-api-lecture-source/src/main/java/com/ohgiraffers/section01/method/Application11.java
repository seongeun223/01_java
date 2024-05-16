package com.ohgiraffers.section01.method;

import javax.xml.namespace.QName;

public class Application11 {
    public static void main(String[] args) {


        System.out.println("전달인자와 매개변수를 이용한 메소드 호출");
        Application11 app11 = new Application11();

        int age = 10;
        int tall = 170;
        String name = "홍길동";

        app11.methodA(170);

        app11.methodB();
        app11.methodC();

        int tall1 = 126;
        byte byteTall = 126;
        app11.methodA(byteTall);

        app11.methodD(age, name, tall);

        //app11.methodF();
        System.out.println(app11.methodF());


        System.out.println("끝");


    }

    public void methodA(int tall) {
        System.out.println("당신의 키는 " + tall + " 입니다.");
    }

    public void methodB() {
        System.out.println("안녕");

    }

    public void methodC() {
        System.out.println("집 보내줘");
    }

    public void methodD(int age, String name, int tall) {
        System.out.println("저는 " + age + "살 " + name + "이고, " + tall + "센치입니다.");
    }

    public String methodF() {
        return "Welcome";
    }

}

