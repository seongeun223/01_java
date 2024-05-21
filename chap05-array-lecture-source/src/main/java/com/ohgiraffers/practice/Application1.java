package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        int[] scores = new int[3];

//        scores[0] = 1;
//        scores[1] = 2;

        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double avg = 0;

        for(int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번째 학생의 점수를 입력하세요.");
            scores[i] = sc.nextInt();
        }
        for(int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        avg = sum/scores.length;

        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);




    }
}
