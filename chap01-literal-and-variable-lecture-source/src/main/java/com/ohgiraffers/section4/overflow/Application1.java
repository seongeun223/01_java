package com.ohgiraffers.section4.overflow;

public class Application1 {
    public static void main(String[] args) {

        byte num1 = 127;

        // num1 = num1 + 1;

        /*
        * 오버 플로우
        *
        * 자료형 별 값의 최대 범위를  벗아나는 경우
        * 발생한 carry를 버림처리하고 sign bit를 반전시켜 최소값을 순환시킨다.
        * */

        System.out.println("num1 = " + num1);

        // 후위 증감 연산자
        num1++; // 오버플로우 발생

        // 127 -> -128
        System.out.println("num1 overflow = " + num1);

        // 기억해야 할 것
        // 타입이 정해진 값을 넘어가게되면 오버플로우가 발생한다.
        // 오버플로우가 발생하면 최대값이 최소값이 된다.


        /*
        * 언더 플로우
        *
        * 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다.
        * */

        byte num2 = -128; // 바이트 최소 저장범위

        System.out.println("num2 = " + num2);

        num2--; // 얘는 빼는 역할

        System.out.println("num2 underflow = " + num2); // +127

        int firstnum = 1000000;
        int secondnum = 700000; // int의 최대 대략 21억 ~~

        int multi = firstnum * secondnum; // 칠천억

        System.out.println("multi = " + multi); // -79669248

        /*
        * 해결방법
        *
        * 오버플로우를 예측하고 더 큰 자료형으로 결과 값을 받아서 처리한다.
        * */

        long longmulti = firstnum *secondnum;

        System.out.println("longmulti = " + longmulti);

        longmulti = (long) firstnum * secondnum; // 강제 형변환




        int salary = 4000000;
        int bonus =500000;
        System.out.println("보너스를 포함한 급여 : " +(salary + bonus) + "원");







    }
}
