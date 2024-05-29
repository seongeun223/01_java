package com.ohgiraffers.section04.use3;

public class SuperDice implements Dice{

    private int min /* = 1*/;
    private int max /* = 10*/;

    public SuperDice() {
        // 생성자(추가로 어떤 작업을 하고 싶을 때) 생성
        this.min = 1;
        this.max = 10;
    }

    @Override
    public int getNumber() {
       // 1~ 10
        int num = (int) (Math.random() *10) + 1; // 0.xxxx -> 곱하기 n
        return num;
        //return (int)(Math.random() * (max - min) + min);
    }
}
