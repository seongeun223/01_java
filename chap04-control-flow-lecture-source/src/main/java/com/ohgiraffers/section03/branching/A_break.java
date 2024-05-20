package com.ohgiraffers.section03.branching;

public class A_break {

    /*
     * break문 반복문 내에서 사용한다.
     *
     * 해당 반복문은 빠져 나올 때 사용하며,
     * 반복문의 조건문 판단 결과와 상관없이 빠져나올 때 사용한다.
     * 일반적으로 if(조건식){break;}처럼 사용된다.
     * switch문은 반복문이 아니지만 예외적으로 사용된다.
     * */

    public void testSimpleBreakStatement() {

        // break문을 이용하여 무한루프를 활용한 1~100까지 합계 구하기

        int sum = 0;
        int i = 1;

        while (true) {

            sum += i;
            System.out.println(i);
            // break문으로 반복문 빠져 나오기
            if (i == 50) {

                break;
            }

            i++;
        }

        System.out.println("1부터 100까지의 합은 " + sum + "입니다.");
    }

    public void testSimpleBreakStatement2() {

        // break는 모든 반복문을 종료하는 것이 아니라, 자신에게 가장 인접한 반복문 실행만 멈춘다.

        /*
         * 구구단 2~9까지 출력
         * su = 5까지만 출력할 것
         * */

        for (int dan = 2; dan < 10; dan++) {

            System.out.println(dan + "단 입니다.");

            for (int su = 1; su < 10; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }

            System.out.println();
        }
    }

    public void testJumpBreak() {

        label:
        for(;;){
            for(int i = 0; i < 10; i++) {
                System.out.println(i);
                if (i == 3) {
                    break label;
                }
            }
        }
    }
}