package com.ohgiraffers.section01.practice;

import java.util.Scanner;

public class practice2 {

    //영어와 수학의 점수를 입력 받는다.
    //두 과목의 평균이 60점 이상이고, 두 과목 모두다 40점 이상이여야 합격이 가능하다.
    //평균이 60점 미만일 경우 “시험 불합격”
    //60점은 넘지만 한과목이 40점 미만일 경우 “한과목 과락으로 인한 불합격”
    //두 조건다 통과할경우 “시험 합격”
    //을 출력한다.

    public void test2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("영어 점수를 입력하세요.");
        int e = sc.nextInt();
        System.out.println("수학 점수를 입력하세요");
        int m = sc.nextInt();

        if((e+m) / 2 >=60)  {
            if(e >= 40) {
                if(m >= 40) {
                    System.out.println("시험 합격");
                } else if(m < 40) {
                    System.out.println("한과목 과락으로 인한 불합격");
                }

            } else if(e < 40) {
                System.out.println("한과목 과락으로 인한 불합격");
            }

        } else {
            System.out.println("시험 불합격");
        }

    }







}
