package com.ohgiraffers.section04;

import java.util.Scanner;

public class practice1 {
    public void test1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 행의 수를 입력하세요");
        



        for(int i = 1; i <=5; i++) {

            for(int j=1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println();

        for(int i =5; i > 0; i--) {

            for(int j=0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }
}
