package com.ohgiraffers.section07.practice;

public class Application1 {
    public static void main(String[] args) {

        System.out.println("산술연산자");
        int a = 15;
        int b = 4;
        System.out.println(a / b);

        System.out.println();
        System.out.println("증감연산자");
        int i = 0;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);

        int i = 0;
        System.out.println("i = " + i++);
        System.out.println("i = " + i);

        int i = 0;
        System.out.println("i = " + (i + i++));
        System.out.println("i = " + i);

        int i = 0;
        int ii = i++;
        System.out.println("ii = " + ii);
        System.out.println("i = " + i);


    }
}
