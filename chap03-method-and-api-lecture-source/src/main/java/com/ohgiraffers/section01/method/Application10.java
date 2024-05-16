package com.ohgiraffers.section01.method;

public class Application10 {
    public static void main(String[] args) {

        int num1 = 16;
        int num2 = 5;

        Calculator calc = new Calculator();


        System.out.println("더하기, 빼기, 곱하기, 나누기 non-static");
        System.out.println("num1 + num2 : " + calc.plusTwoNumber(num1 , num2));
        System.out.println("num1 - num2 : " + calc.minusTwoNumber(num1 , num2));
        System.out.println("num1 * num2 : " + calc.multipleTwoNumber(num1 , num2));
        System.out.println("num1 / num2 : " + calc.divideTwoNumber(num1 , num2));

        System.out.println();
        System.out.println("나머지 static");
        Calculator.remainder(num1, num2);
        System.out.println("num1 % num2 : " + (Calculator.remainder(num1 , num2)));

        int result = Calculator.remainder(num1, num2);
        System.out.println("num1 % num2 : " + result);


         /*
    * Calculator class에
      더하기, 빼기, 곱하기, 나누기, 나머지
      이 각각을 수행할 수 있는 메소드를 만들고
      Application10의 main 메소드에 출력하라.

      (더하기, 빼기, 곱하기, 나누기 => non-static
      나머지 => static)
     */

        // 더하기

        // 빼기

        // 곱하기

        // 나누기

        // 나머지


    }

}
