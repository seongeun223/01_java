package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        //java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);

        // java.lang은 패키지 이름 생략 가능
        //java.util.Scanner scanner = new java.util.Scanner(System.in);

        Scanner sc = new Scanner(System.in);
//
////        int num = sc.nextInt();
////
////        System.out.println(num);
//
//        // 자료형별 값 입력받기
//        /*
//        * 문자열 입력 받기
//        *
//        * nextLine() : 입력받은 값을 문자열로 반환해준다.
//        * */
        System.out.print("이름을 입력하세요 : ");
        String name = sc. nextLine();
        System.out.print("입력하신 이름은" + name + "입니다.");
//
//        /*
//        * 정수형 값 입력받기
//        *
//        * nextInt() : 입력받은 값을 int 형으로 반환해준다.
//        * */
//
        System.out.print("나이를 입력하세요.");
        int age = sc. nextInt(); // 매개변수 : 진법
        System.out.print("입력하신 나이는 " + age + "입니다.");
//
//        // nextByte(), nextShort()
//
//        /*
//        * 정수형(long)
//        *
//        * nextLong() : 입력받은 값을 long형으로 반환해준다.
//        * */
//
        System.out.print("원하는 월급을 입력해주세요.");
        long money = sc. nextLong();
        System.out.print("입력하신 금액은 " + money + "입니다.");
//
//        /*
//        * 실수형(float)
//        *
//        * nextFloat() : 입력받은 값을 float형으로 반환해준다.
//        * */
//
        System.out.print("키를 입력해주세요 : ");
        float height = sc.nextFloat();
        System.out.print("입력하신 키는 " + height + "입니다.");
//
//        /*
//        * 실소형(double)
//        *
//        * nextDouble() : 입력받은 값을 Double형으로 반환해준다.
//        * */
        System.out.print("원주율(파이)를 아는 만큼 입력하세요");
        double pi = sc.nextDouble();
        System.out.print("입력한 원주율은 " + pi + "입니다.");
//
//        /*
//        * 논리형(boolean)
//        *
//        * nextBoolean() : 입력받은 값을 boolean형으로 반환한다.
//        * */
        System.out.print("참과 거짓 중에 한 가지를 true or false로 입력해주세요");
        System.out.print("나는 복습을 잘하고 있다.");
        boolean isTrue = sc.nextBoolean();
        System.out.print("입력하신 논리 값은 " + isTrue + "입니다.");

        // 에러 발생

        sc.nextLine();

        System.out.println("아무 문자나 입력하세요");
        String str = sc.nextLine();
        char ch = str.charAt(3);
        System.out.println("입력하신 문자는 " + ch + "입니다.");


    }
}
