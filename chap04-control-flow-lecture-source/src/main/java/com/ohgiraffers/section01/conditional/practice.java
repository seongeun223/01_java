package com.ohgiraffers.section01.conditional;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class practice {

    public void test() {
        System.out.println("A가 B에게 할 말은? ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if(answer == 1) {
            System.out.println("안녕");
        } else if(answer == 2) {
            System.out.println("야레야레 못말리는 아가씨");
        } else if(answer == 3) {
            System.out.println("나랑 밥 먹을래 나랑 사귈래");
        } else {
            System.out.println("우리는 사실 남매야.");
        }
        System.out.println("결국 그들은 개미가 되었다.");

    }
    public void test2(){
        Scanner sc = new Scanner(System.in);
    }


}
