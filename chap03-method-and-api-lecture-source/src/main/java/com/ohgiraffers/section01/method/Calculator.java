package com.ohgiraffers.section01.method;


public class Calculator {


    // 삼항연산자로 두 수를 비교해서 작은 값을 return 해주는 메소드
    public int nonStaticNumberOf(int first, int second) {

        //int result = (first > second)? second : first;

        return (first > second)? second : first;

    }

    // 삼항연산자로 두 수를 비교해서 큰 값을 return 해주는 메소드
    public static int staticMaxNumberOf(int first, int second) {

        return(first > second)? first : second;
    }
    public int plusTwoNumber(int num1, int num2) {

        return num1 + num2;
    }

    public int minusTwoNumber(int num1, int num2) {

        return num1 - num2;
    }
    public int multipleTwoNumber(int num1, int num2) {

        return num1 * num2;
    }

    public int divideTwoNumber(int num1, int num2) {

        return num1 / num2;
    }

    public static int remainder(int num1, int num2) {

        return num1 % num2;
    }




}
