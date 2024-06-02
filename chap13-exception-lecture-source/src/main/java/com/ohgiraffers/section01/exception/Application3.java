package com.ohgiraffers.section01.exception;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        ExceptionTest et =new ExceptionTest();

        Scanner sc = new Scanner(System.in);

        System.out.println("물건의 가격은 입력해주세요 : ");
        int price = sc. nextInt();

        System.out.println();

        System.out.println("소지하고 있는 돈을 입력해주세요 : ");
        int money = sc.nextInt();

        try {

            et.checkEnoughMoney(10000,50000);

            System.out.println("============ 상품 구입 가능 ============");

        } catch (Exception e) {

            System.out.println("============= 상품 구입 불가 ============");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
